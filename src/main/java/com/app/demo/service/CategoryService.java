package com.app.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.model.Category;
import com.app.demo.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepo;

	public List<Category> fetchAllCategory() {
		return categoryRepo.findAll();
	}

	public Category findSingleCategory(String catId) {
		return categoryRepo.findByCategoryId(catId);
	}
}
