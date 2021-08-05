package com.victor.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.victor.crud.entities.Empresa;

@Repository
public interface EmpresaRepository  extends JpaRepository<Empresa, Long>{

}