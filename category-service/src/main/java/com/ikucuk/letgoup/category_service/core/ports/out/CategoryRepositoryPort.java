package com.ikucuk.letgoup.category_service.core.ports.out;

import com.ikucuk.letgoup.category_service.core.domain.entity.category.CategoryEntity;

public interface CategoryRepositoryPort {

    void save(CategoryEntity category);
    CategoryEntity findById(Long id);
}
