package com.ikucuk.letgoup.category_service;

import com.ikucuk.letgoup.category_service.core.ports.in.CategoryServicePort;
import com.ikucuk.letgoup.category_service.core.ports.out.CategoryRepositoryPort;
import com.ikucuk.letgoup.category_service.core.usecases.CreateCategoryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class CategoryServiceApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(CategoryServiceApplication.class, args);
	}

}
