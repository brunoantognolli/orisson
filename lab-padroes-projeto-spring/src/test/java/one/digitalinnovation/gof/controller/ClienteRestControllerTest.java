package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;
import one.digitalinnovation.gof.service.ClienteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ClienteRestControllerTest {

    @InjectMocks
    ClienteRestController clienteRestController;

    @Mock
    ClienteService clienteService;

    @Mock
    ClienteRepository clienteRepository;

    @Mock
    Cliente cliente;

    @Test
    void buscarTodos() {
        var response = clienteRestController.buscarTodos();
        Assertions.assertEquals(200, response.getStatusCodeValue());
    }

    @Test
    void buscarPorId() {
    }

    @Test
    void inserir() {
        var response = clienteRestController.inserir(cliente);
        Assertions.assertEquals(201, response.getStatusCodeValue());
    }

    @Test
    void atualizar() {
    }

    @Test
    void deletar() {
    }
}