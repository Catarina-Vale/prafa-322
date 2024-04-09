package com.rafa.rafa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafa.rafa.Repository.MateriaRepository;
import com.rafa.rafa.Repository.MateriaToUserRepository;
import com.rafa.rafa.Service.Interfaces.IMateriaService;
import com.rafa.rafa.models.Materia;

@Service
public class MateriaService implements IMateriaService {

    @Autowired
    MateriaRepository materiaRepository;

    @Autowired
    MateriaToUserRepository materiaToUserRepository;

    @Override
    public Materia createMateria(Materia materia) {
        return materiaRepository.save(materia);
    }

    @Override
    public Materia getMateriaById(int id) {
        return materiaRepository.findById(id).orElse(null);
    }

    @Override
    public void associateUserWithMateria(int userId, int materiaId) {
        materiaToUserRepository.associateUserWithMateria(userId, materiaId);
    }
    
}
