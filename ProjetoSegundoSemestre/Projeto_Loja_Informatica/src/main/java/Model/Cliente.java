package Model;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {

    private String nome;
    private int id;
    private String cpf;
    private Date data_Nascimento;
    private String sexo;
    private String Estado_civil;
    private String rua, cidade, estado, cep;
    private String telefone;
    private String celular;
    private String email;
    
     private ArrayList<Cliente> listaItens = null;

    public Cliente() {

    }

    public Cliente(String nome, int id, String cpf, Date data_Nascimento, String sexo, String Estado_civil, String rua, String cidade, String estado, String cep, String telefone, String celular, String email) {
        this.nome = nome;
        this.id = id;
        this.cpf = cpf;
        this.data_Nascimento = data_Nascimento;
        this.sexo = sexo;
        this.Estado_civil = Estado_civil;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_Nascimento() {
        return data_Nascimento;
    }

    public void setData_Nascimento(Date data_Nascimento) {
        this.data_Nascimento = data_Nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return Estado_civil;
    }

    public void setEstado_civil(String Estado_civil) {
        this.Estado_civil = Estado_civil;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    public ArrayList<Cliente> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<Cliente> listaItens) {
        this.listaItens = listaItens;
    }
    

}
