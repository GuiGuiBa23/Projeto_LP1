package controller;

import model.Cliente;
import service.ClienteService;

public class ClienteController {
    private ClienteService clienteService = new ClienteService();

    public void cadastrarCliente(Cliente cliente) {
        clienteService.cadastrarCliente(cliente);
    }
}
