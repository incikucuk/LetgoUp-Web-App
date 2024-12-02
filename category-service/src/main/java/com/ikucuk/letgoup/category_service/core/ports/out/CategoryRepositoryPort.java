package com.ikucuk.letgoup.category_service.core.ports.out;

import com.ikucuk.letgoup.category_service.core.domain.CategoryEntity;
import com.ikucuk.letgoup.category_service.dto.CategoryDTO;

import java.util.Optional;

public interface CategoryRepositoryPort {

    void save(CategoryDTO categoryDTO);

    Optional<CategoryDTO> findById(Long id);

//    void delete(CategoryDTO category);
}
