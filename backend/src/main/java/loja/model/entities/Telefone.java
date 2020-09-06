package loja.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Telefone {
    
    @Id
    @GeneratedValue()
    private Long id;
    private String numero;

    @ManyToOne
    private Cliente cliente;

    public Telefone(){}

    public Telefone(Long id, String numero, Cliente cliente) {
        this.id = id;
        this.numero = numero;
        this.cliente = cliente;
    }

    public Long getId(){
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    } 

    @JsonIgnore
    public Cliente getcliente(){
        return cliente;
    }
}
