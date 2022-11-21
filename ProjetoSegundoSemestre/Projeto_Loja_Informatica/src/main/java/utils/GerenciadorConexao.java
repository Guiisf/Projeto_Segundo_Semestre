package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Guilherme.Ferreira
 */
public class GerenciadorConexao {

    /**
     * @return the STATUS
     */
    public static String getSTATUS() {
        return STATUS;
    }

    /**
     * @param aSTATUS the STATUS to set
     */
    public static void setSTATUS(String aSTATUS) {
        STATUS = aSTATUS;
    }

    /**
     * @return the DRIVER
     */
    public static String getDRIVER() {
        return DRIVER;
    }

    /**
     * @param aDRIVER the DRIVER to set
     */
    public static void setDRIVER(String aDRIVER) {
        DRIVER = aDRIVER;
    }

    /**
     * @return the SERVER
     */
    public static String getSERVER() {
        return SERVER;
    }

    /**
     * @param aSERVER the SERVER to set
     */
    public static void setSERVER(String aSERVER) {
        SERVER = aSERVER;
    }

    /**
     * @return the DATABASE
     */
    public static String getDATABASE() {
        return DATABASE;
    }

    /**
     * @param aDATABASE the DATABASE to set
     */
    public static void setDATABASE(String aDATABASE) {
        DATABASE = aDATABASE;
    }

    /**
     * @return the LOGIN
     */
    public static String getLOGIN() {
        return LOGIN;
    }

    /**
     * @param aLOGIN the LOGIN to set
     */
    public static void setLOGIN(String aLOGIN) {
        LOGIN = aLOGIN;
    }

    /**
     * @return the SENHA
     */
    public static String getSENHA() {
        return SENHA;
    }

    /**
     * @param aSENHA the SENHA to set
     */
    public static void setSENHA(String aSENHA) {
        SENHA = aSENHA;
    }

    /**
     * @return the URL
     */
    public static String getURL() {
        return URL;
    }

    /**
     * @param aURL the URL to set
     */
    public static void setURL(String aURL) {
        URL = aURL;
    }

    /**
     * @return the CONEXAO
     */
    public static Connection getCONEXAO() {
        return CONEXAO;
    }

    /**
     * @param aCONEXAO the CONEXAO to set
     */
    public static void setCONEXAO(Connection aCONEXAO) {
        CONEXAO = aCONEXAO;
    }

    private static String STATUS = "Não conectado";
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";

    private static String SERVER = "localhost";
    private static String DATABASE = "projetoPi";

    private static String LOGIN = "root";
    private static String SENHA = "root";

    private static String URL = "jdbc:mysql://localhost:3306/projetoPi?useTimezone=true&serverTimezone=UTC&useSSL=false";

    private static Connection CONEXAO;

    public GerenciadorConexao() {
    }

    public static Connection abrirConexao() throws ClassNotFoundException, SQLException {

        setURL("jdbc:mysql://" + getSERVER() + ":3306/" + getDATABASE() + "?useTimezone=true&serverTimezone=UTC&useSSL=false");

        if (getCONEXAO() == null) {
            try {

                Class.forName(getDRIVER());
                setCONEXAO(DriverManager.getConnection(getURL(), getLOGIN(), getSENHA()));

                if (getCONEXAO() != null) {
                    setSTATUS("Conexão realizada com sucesso!");
                } else {
                    setSTATUS("Não foi possivel realizar a conexão");
                }

            } catch (ClassNotFoundException e) {

                throw new ClassNotFoundException("O driver expecificado nao foi encontrado.");

            } catch (SQLException e) {

                throw new SQLException("Erro ao estabelecer a conexão (Ex: login ou senha errados).");
            }

        } else {
            try {

                if (getCONEXAO().isClosed()) {
                    setCONEXAO(DriverManager.getConnection(getURL(), getLOGIN(), getSENHA()));
                }
            } catch (SQLException ex) {
                throw new SQLException("Falha ao fechar a conexão.");
            }
        }
        return getCONEXAO();
    }

    public static String getStatusConexao() {
        return getSTATUS();
    }

    public static boolean fecharConexao() throws SQLException {

        boolean retorno = false;

        try {
            if (getCONEXAO() != null) {
                if (!CONEXAO.isClosed()) {
                    getCONEXAO().close();
                }
            }

            setSTATUS("Não conectado");
            retorno = true;

        } catch (SQLException e) {
            retorno = false;
        }

        return retorno;
    }

}
