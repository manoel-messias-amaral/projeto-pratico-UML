package com.amaral.mcontatoUML.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amaral.mcontatoUML.domain.Categoria;
import com.amaral.mcontatoUML.repositories.CategoriaRepository;
import com.sun.el.stream.Optional;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	public Categoria find(Integer id) {
		Optional obj = repo.findOne(id);
		return (Categoria) obj.orElse(null);
		
	}
	public Categoria buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
