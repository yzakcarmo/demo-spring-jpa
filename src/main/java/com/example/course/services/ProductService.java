package com.example.course.services;

import com.example.course.entities.Product;
import com.example.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() { return repository.findAll(); }

    public Product findById(Long id) {
        Optional<Product> opt = repository.findById(id);
        return opt.get();
    }
}
