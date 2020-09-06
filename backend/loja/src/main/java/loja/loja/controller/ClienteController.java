package loja.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import loja.loja.database.repositories.ClienteRepository;
import loja.loja.model.entities.Cliente;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {
    
    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll(){
        List<Cliente> clientes = clienteRepository.findAll();
        return ResponseEntity.ok().body(clientes);
    }

}
