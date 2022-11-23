package br.com.flavio.flavioapi.resource;

import br.com.flavio.flavioapi.model.Contato;
import br.com.flavio.flavioapi.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contatos")
public class ContatoResource {

    @Autowired
    private ContatoRepository contatoRepository;

    @GetMapping("/todos")
    public List<Contato> listarTodosContatos() {
        return contatoRepository.findAll();
    }

}
