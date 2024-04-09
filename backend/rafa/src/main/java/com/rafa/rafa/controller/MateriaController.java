package com.rafa.rafa.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rafa.rafa.Service.Interfaces.IMateriaService;
import com.rafa.rafa.models.Materia;

@RestController
public class MateriaController {

    @Autowired
    private IMateriaService materiaService;

    @PostMapping("/materia/create")
    public ResponseEntity<Materia> createUser(@RequestBody Materia materia) {
        Materia createdMateria = materiaService.createMateria(materia);
        return new ResponseEntity<>(createdMateria, HttpStatus.CREATED);
    }

    @GetMapping("/materia/{id}")
    public ResponseEntity<Materia> getUserById(@PathVariable int id) {
        Materia materia = materiaService.getMateriaById(id);
        if (materia != null) {
            return new ResponseEntity<>(materia, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/materia/associate/{userid}/{materiaid}")
    public ResponseEntity<String> associateMateriaToUser(@PathVariable int userid, @PathVariable int materiaid) {
        materiaService.associateUserWithMateria(userid, materiaid);
        return new ResponseEntity<>("nice" ,HttpStatus.OK);
    }
}