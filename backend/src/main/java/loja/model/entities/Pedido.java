package loja.model.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime instanteCompra;

    public Pedido(){}

    public Pedido(Long id, LocalDateTime instanteCompra) {
        this.id = id;
        this.instanteCompra = instanteCompra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getInstanteCompra() {
        return instanteCompra;
    }

    public void setInstanteCompra(LocalDateTime instanteCompra) {
        this.instanteCompra = instanteCompra;
    }
    
    
}
