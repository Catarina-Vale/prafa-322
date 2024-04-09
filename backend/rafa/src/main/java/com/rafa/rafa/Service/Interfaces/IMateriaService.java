package com.rafa.rafa.Service.Interfaces;

import java.util.List;

import com.rafa.rafa.models.Materia;

public interface IMateriaService {
    Materia createMateria(Materia materia);
    Materia getMateriaById(int id);
    void associateUserWithMateria(int userId, int materiaId);
}