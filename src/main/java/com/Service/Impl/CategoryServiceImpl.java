package com.Service.Impl;


import com.Entity.CategoryRRV;
import com.Service.CategoryService;
import com.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public CategoryRRV getById(String id) {
        return categoryRepository.findOne(id);
    }
}
