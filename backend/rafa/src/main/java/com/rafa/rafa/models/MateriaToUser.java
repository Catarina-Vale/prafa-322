package com.rafa.rafa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MateriaToUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private int materiaId;
    
    public MateriaToUser() {
    }
    
    public MateriaToUser(int id, int userId, int materiaId) {
        this.id = id;
        this.userId = userId;
        this.materiaId = materiaId;
    }
    
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getUserId() {
        return userId;
    }

    public void setMateriaId(int materiaId) {
        this.materiaId = materiaId;
    }
    public int getMateriaId() {
        return materiaId;
    }
}
