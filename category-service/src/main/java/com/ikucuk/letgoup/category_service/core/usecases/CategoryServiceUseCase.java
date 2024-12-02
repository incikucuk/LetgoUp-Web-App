package com.ikucuk.letgoup.category_service.core.usecases;

import com.ikucuk.letgoup.category_service.core.ports.in.CategoryServicePort;
import com.ikucuk.letgoup.category_service.core.ports.out.CategoryRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceUseCase implements CategoryServicePort {

    private final CategoryRepositoryPort categoryRepositoryPort;

    public CategoryServiceUseCase(CategoryRepositoryPort categoryRepositoryPort) {
        this.categoryRepositoryPort = categoryRepositoryPort;
    }
}
