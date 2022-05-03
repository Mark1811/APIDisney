package com.javadabadu.disney.repository;

import com.javadabadu.disney.models.entity.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PersonajeRepository extends JpaRepository<Personaje, Integer> {

    @Query(value = "select * from  fn_last_value_id_personaje()", nativeQuery = true)
    Integer lastValueId();

    @Query(value = "select * from fn_soft_delete_personaje(:id) ",nativeQuery = true)
    boolean softDelete(Integer id);

    Optional<List<Personaje>> findByNombre(String nombre);

    Optional<List<Personaje>> findByEdad(Integer edad);

}
