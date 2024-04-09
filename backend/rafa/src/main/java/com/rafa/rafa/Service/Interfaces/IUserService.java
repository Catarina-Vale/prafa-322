package com.rafa.rafa.Service.Interfaces;

import java.util.List;

import com.rafa.rafa.models.Materia;
import com.rafa.rafa.models.User;

public interface IUserService {
    User createUser(User user);
    User getUserById(int id);
    List<Materia> getEnrolledMateriasByUserId(int id);
    User makeLogin(int id, String password);
}