package com.rafa.rafa.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private int professorid;
    
    public Materia() {
    }
    
    public Materia(int id, String nome, int professorid) {
        this.id = id;
        this.nome = nome;
        this.professorid = professorid;
    }
    
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public int getprofessorid() {
        return professorid;
    }

    public void setprofessorid(int professorid) {
        this.professorid = professorid;
    }
}
