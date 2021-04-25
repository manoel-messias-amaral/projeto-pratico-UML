package com.amaral.mcontatoUML.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amaral.mcontatoUML.domain.Categoria;
import com.sun.el.stream.Optional;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

	Optional findOne(Integer id);

}
