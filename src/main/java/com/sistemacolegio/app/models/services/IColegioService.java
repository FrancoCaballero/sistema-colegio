package com.sistemacolegio.app.models.services;

import java.util.List;

import com.sistemacolegio.app.models.entity.Asignatura;
import com.sistemacolegio.app.models.entity.Colegio;
import com.sistemacolegio.app.models.entity.Profesor;

public interface IColegioService {
	
	public List<Colegio> findAllColegio();
	
	public List<Profesor> findAllProfesor();
	
	public List<Asignatura> findAllAsignatura();
	
	public Colegio findOneColegio(Long id);
	
	public Profesor findOneProfesor(Long id);
	
	public void deleteColegio(Long id);
	
	public void deleteProfesor(Long id);
	
	public void saveColegio(Colegio colegio);
	
	public void saveProfesor(Profesor profesor);
}
