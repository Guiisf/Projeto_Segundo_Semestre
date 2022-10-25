package Model;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class Cliente {

    private String nome;
    private String cpf;
    private String data_Nascimento;
    private String rua, cidade, cep;
    private int telefone;
    private int celular;
    private String email;

    public Cliente() {

    }

    public Cliente(String nome, String cpf, String data_Nascimento, String rua, String cidade, String cep, int telefone, int celular, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_Nascimento = data_Nascimento;
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_Nascimento() {
        return data_Nascimento;
    }

    public void setData_Nascimento(String data_Nascimento) {
        this.data_Nascimento = data_Nascimento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
