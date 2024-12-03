package com.ikucuk.letgoup.category_service.config;

import com.ikucuk.letgoup.category_service.adapters.out.JpaCategoryRepositoryAdapter;
import com.ikucuk.letgoup.category_service.core.ports.in.CategoryServicePort;
import com.ikucuk.letgoup.category_service.core.ports.out.CategoryRepositoryPort;
import com.ikucuk.letgoup.category_service.core.usecases.CreateCategoryService;
import com.ikucuk.letgoup.category_service.core.usecases.CreateCategoryUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryConfig {

    @Bean
    public CreateCategoryService createCategoryUsecase(CategoryRepositoryPort
                                                   categoryRepositoryPort) {
        return new CreateCategoryUseCase(categoryRepositoryPort);
    }
}

