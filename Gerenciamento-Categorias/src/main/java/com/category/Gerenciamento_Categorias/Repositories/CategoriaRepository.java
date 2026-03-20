package com.category.Gerenciamento_Categorias.Repositories;

import com.category.Gerenciamento_Categorias.Models.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {

}