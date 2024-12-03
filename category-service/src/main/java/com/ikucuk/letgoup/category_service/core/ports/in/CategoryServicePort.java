package com.ikucuk.letgoup.category_service.core.ports.in;

import com.ikucuk.letgoup.category_service.dto.CategoryDTO;

public interface CategoryServicePort {

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO findByCategoryId(Long id);

//    void updateCategory(Long id, CategoryDTO customer);
//
//    void deleteCategory(Long id);
}
