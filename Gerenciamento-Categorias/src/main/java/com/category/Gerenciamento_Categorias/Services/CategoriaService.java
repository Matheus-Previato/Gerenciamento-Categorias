package com.category.Gerenciamento_Categorias.Services;

import com.category.Gerenciamento_Categorias.Models.CategoriaModel;
import com.category.Gerenciamento_Categorias.Repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public CategoriaModel salvar(CategoriaModel categoria) {
        return repository.save(categoria);
    }

    public List<CategoriaModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<CategoriaModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}