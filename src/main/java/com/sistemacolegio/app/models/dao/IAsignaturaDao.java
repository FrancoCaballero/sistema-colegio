package com.sistemacolegio.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.sistemacolegio.app.models.entity.Asignatura;

public interface IAsignaturaDao extends CrudRepository<Asignatura, Long>  {

}
