package com.sistemacolegio.app.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.sistemacolegio.app.models.entity.Profesor;

public interface IProfesorDao extends CrudRepository<Profesor, Long> {
	
}
