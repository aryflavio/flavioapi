package br.com.flavio.flavioapi.resource;

import br.com.flavio.flavioapi.model.Cliente;
import br.com.flavio.flavioapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ClienteResource {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> ListarTodosClientes(){
        return clienteRepository.findAll();
    }
}
