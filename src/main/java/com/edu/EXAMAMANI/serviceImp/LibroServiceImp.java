package com.edu.EXAMAMANI.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.EXAMAMANI.dao.LibroDao;
import com.edu.EXAMAMANI.entity.Libro;
import com.edu.EXAMAMANI.service.LibroService;
@Service
public class LibroServiceImp implements LibroService {
	@Autowired
	private LibroDao librodao;
	@Override
	public List<Libro> readAll() {
		return librodao.readAll();
	}

}
