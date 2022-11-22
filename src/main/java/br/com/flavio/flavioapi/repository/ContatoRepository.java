package br.com.flavio.flavioapi.repository;

import br.com.flavio.flavioapi.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
