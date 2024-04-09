package com.rafa.rafa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafa.rafa.models.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Integer> {
    // You can add custom query methods here if needed
}
