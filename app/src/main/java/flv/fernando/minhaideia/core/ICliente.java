package flv.fernando.minhaideia.core;

import java.util.ArrayList;

import flv.fernando.minhaideia.model.Cliente;

public interface ICliente {
    public boolean salvar(Cliente cliente);
    public Cliente carregar(int id);
    public boolean altualizar(Cliente cliente);
    public boolean apagar(int id);
    public ArrayList<Cliente>ListaTodos();

}
