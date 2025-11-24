package service;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    private List<Cliente> clientes = new ArrayList<>();
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente); }

}
