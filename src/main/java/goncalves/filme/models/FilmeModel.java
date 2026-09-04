package goncalves.filme.models;

import goncalves.filme.enums.FilmeEnum;
import jakarta.persistence.*;

@Entity
public class FilmeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public String nome;
    @Enumerated(EnumType.STRING)
    public FilmeEnum genero;
    public String diretor;
    public String estudio;

    public FilmeModel(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public FilmeEnum getGenero(){
        return genero;
    }

    public void setGenero(FilmeEnum genero){
        this.genero = genero;
    }

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public String getEstudio(){
        return estudio;
    }

    public void setEstudio(String estudio){
        this.estudio = estudio;
    }


}
