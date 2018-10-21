package com.app.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.model.Category;
import com.app.demo.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/category")
	public String defaultValue() {
		return "Welcome to CMS";
	}
	@GetMapping("/category/all")
	public List<Category> getAllCategory() {
		return categoryService.fetchAllCategory();
	}

	@GetMapping("/category/{catId}")
	public Category getSingleCategory(@PathVariable String catId) {
		return categoryService.findSingleCategory(catId);
	}
}
