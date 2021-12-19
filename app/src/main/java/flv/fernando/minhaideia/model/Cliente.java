package flv.fernando.minhaideia.model;

import java.util.ArrayList;

import flv.fernando.minhaideia.core.ICliente;

public class Cliente implements ICliente {
    private String nome;
    private String email;
    private String telefone;
    private int idade;
    private int sexo;

    public Cliente(String nome, String email, String telefone, int idade, int sexo) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int sexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean salvar(Cliente cliente) {
        return false;
    }

    @Override
    public Cliente carregar(int id) {
        return null;
    }

    @Override
    public boolean altualizar(Cliente cliente) {
        return false;
    }

    @Override
    public boolean apagar(int id) {
        return false;
    }

    @Override
    public ArrayList<Cliente> ListaTodos() {
        return null;
    }
}
