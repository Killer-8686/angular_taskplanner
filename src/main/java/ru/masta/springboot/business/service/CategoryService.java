package ru.masta.springboot.business.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.masta.springboot.business.entity.Category;
import ru.masta.springboot.business.repo.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository repository;

    @Autowired
    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> findAll(String email){
        return repository.findAll();
    }

}
