package com.sistemacolegio.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.sistemacolegio.app.models.entity.Colegio;

public interface IColegioDao extends CrudRepository<Colegio, Long> {
	
}
