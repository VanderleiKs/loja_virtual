package loja.loja.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cidade {
    
    @Id
    @GeneratedValue()
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "cidade")
    private List<Endereco> enderecos = new ArrayList<>();

    @ManyToOne
    private Estado estado;

    public Cidade(){}

    public Cidade(Long id, String nome, Estado estado){
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonIgnore
    public List<Endereco> getEnderecos(){
        return enderecos;
    }

    public void addEndereco(Endereco endereco){
        enderecos.add(endereco);
    }

    public Estado getEstado(){
        return estado;
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }

}
