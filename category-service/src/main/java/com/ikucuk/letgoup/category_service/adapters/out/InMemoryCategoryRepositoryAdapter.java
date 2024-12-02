package com.ikucuk.letgoup.category_service.adapters.out;

import com.ikucuk.letgoup.category_service.core.domain.entity.category.CategoryEntity;
import com.ikucuk.letgoup.category_service.core.ports.out.CategoryRepositoryPort;

public class InMemoryCategoryRepositoryAdapter implements CategoryRepositoryPort {

    @Override
    public void save(CategoryEntity category) {

    }

    @Override
    public CategoryEntity findById(Long id) {
        return null;
    }
}
