package com.rafa.rafa.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rafa.rafa.models.Materia;
import com.rafa.rafa.models.MateriaToUser;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaToUserRepository extends JpaRepository<MateriaToUser, Integer> {
    // Query para pegar todas as matérias relacionadas a um usuário
    @Query("SELECT m FROM Materia m JOIN MateriaToUser mtu ON m.id = mtu.materiaId WHERE mtu.userId = :userId")
    List<Materia> findMateriasByUserId(@Param("userId") int userId);

    // Query para associar um usuário a uma matéria
    @Query(value = "INSERT INTO user_to_materia (userId, materiaId) VALUES (:userId, :materiaId)", nativeQuery = true)
    void associateUserWithMateria(@Param("userId") int userId, @Param("materiaId") int materiaId);
}