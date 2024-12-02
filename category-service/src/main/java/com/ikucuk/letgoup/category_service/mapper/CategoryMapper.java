package com.ikucuk.letgoup.category_service.mapper;

import com.ikucuk.letgoup.category_service.core.domain.entity.category.CategoryEntity;
import com.ikucuk.letgoup.category_service.dto.CategoryDTO;

public class CategoryMapper {

    public static CategoryDTO categoryEntityToCategoryDTO(CategoryEntity categoryEntity) {
        CategoryDTO categoryDto = new CategoryDTO();

        categoryDto.setId(categoryEntity.getId());
        categoryDto.setName(categoryEntity.getName());
        categoryDto.setParent(categoryEntity.getParent());
        categoryDto.setSubCategories(categoryEntity.getSubCategories());

        return categoryDto;
    }

    public static CategoryEntity categoryDTOToCategoryEntity(CategoryDTO categoryDto) {
        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setId(categoryDto.getId());
        categoryEntity.setName(categoryDto.getName());
        categoryEntity.setParent(categoryDto.getParent());
        categoryEntity.setSubCategories(categoryDto.getSubCategories());

        return categoryEntity;
    }
}
