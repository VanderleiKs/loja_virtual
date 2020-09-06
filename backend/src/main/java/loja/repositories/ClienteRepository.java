package loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import loja.model.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
