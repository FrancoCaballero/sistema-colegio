package com.sistemacolegio.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistemacolegio.app.models.dao.IAsignaturaDao;
import com.sistemacolegio.app.models.dao.IColegioDao;
import com.sistemacolegio.app.models.dao.IProfesorDao;
import com.sistemacolegio.app.models.entity.Asignatura;
import com.sistemacolegio.app.models.entity.Colegio;
import com.sistemacolegio.app.models.entity.Profesor;

@Service
public class ColegioServiceImpl implements IColegioService {

	@Autowired
	private IColegioDao colegioDao;

	@Autowired
	private IProfesorDao profesorDao;
	
	@Autowired
	private IAsignaturaDao asignaturaDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Asignatura> findAllAsignatura(){
		return (List<Asignatura>) asignaturaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Colegio> findAllColegio() {
		return (List<Colegio>) colegioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Profesor> findAllProfesor() {
		return (List<Profesor>) profesorDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Colegio findOneColegio(Long id) {
		return colegioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Profesor findOneProfesor(Long id) {
		return profesorDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void deleteColegio(Long id) {	
		colegioDao.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteProfesor(Long id) {
		profesorDao.deleteById(id);
	}

	@Override
	@Transactional
	public void saveColegio(Colegio colegio) {
		colegioDao.save(colegio);
	}

	@Override
	@Transactional
	public void saveProfesor(Profesor profesor) {
		profesorDao.save(profesor);
	}



}
