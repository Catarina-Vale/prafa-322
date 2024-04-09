package com.rafa.rafa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rafa.rafa.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // You can add custom query methods here if needed
}