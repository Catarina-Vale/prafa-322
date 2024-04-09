package com.rafa.rafa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafa.rafa.Repository.MateriaToUserRepository;
import com.rafa.rafa.Repository.UserRepository;
import com.rafa.rafa.Service.Interfaces.IUserService;
import com.rafa.rafa.models.Materia;
import com.rafa.rafa.models.User;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MateriaToUserRepository materiaToUserRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User makeLogin(int id, String password) {
         User userToCheck = userRepository.findById(id).orElse(null);
         if(password.equals(userToCheck.getPassword())){
            return userToCheck;
         }
         else{
            return new User(0,"wrong","wrong",0);
         }
    }

    @Override
    public List<Materia> getEnrolledMateriasByUserId(int id) {
        return materiaToUserRepository.findMateriasByUserId(id);
    }
}