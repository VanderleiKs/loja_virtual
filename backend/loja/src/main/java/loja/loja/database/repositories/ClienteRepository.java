package loja.loja.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import loja.loja.model.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
