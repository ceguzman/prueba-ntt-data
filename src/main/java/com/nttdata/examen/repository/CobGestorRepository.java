package com.nttdata.examen.repository;

import com.nttdata.examen.model.CobGestor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings("unused")
@Repository
public interface CobGestorRepository extends JpaRepository<CobGestor, String> {
   @Query("SELECT  CONCAT(u.primerNombre,u.primerApellido ) from  CobGestor u ")
   List<String> findByConcatNames();
}
