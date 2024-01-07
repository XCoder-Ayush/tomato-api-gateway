package com.backend.tomato.services;

import com.backend.tomato.dao.CategoryDao;
import com.backend.tomato.entitites.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;
    public Category addCategory(Category category){
        category.setId(UUID.randomUUID().toString());
        this.categoryDao.save(category);
        return category;
    }

    public List<Category> getCategories(){
        return this.categoryDao.findAll();
    }
}
