package com.ikucuk.letgoup.category_service.dto;

import com.ikucuk.letgoup.category_service.core.domain.entity.category.CategoryEntity;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class CategoryDTO {
    private Long id;
    private String name;
    private CategoryEntity parent;
    private Set<CategoryEntity> subCategories = new HashSet<CategoryEntity>();
}
