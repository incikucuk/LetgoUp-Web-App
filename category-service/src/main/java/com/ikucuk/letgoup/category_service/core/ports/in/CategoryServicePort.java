package com.ikucuk.letgoup.category_service.core.ports.in;

import com.ikucuk.letgoup.category_service.dto.CategoryDTO;

public interface CategoryServicePort {

    void createCategory(CategoryDTO categoryDTO);

//    CategoryDTO getCategoryById(Long id);
//
//    void updateCategory(Long id, CategoryDTO customer);
//
//    void deleteCategory(Long id);
}
