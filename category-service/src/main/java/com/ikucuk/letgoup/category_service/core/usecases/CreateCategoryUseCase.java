package com.ikucuk.letgoup.category_service.core.usecases;

import com.ikucuk.letgoup.category_service.core.domain.CategoryEntity;
import com.ikucuk.letgoup.category_service.core.ports.in.CategoryServicePort;
import com.ikucuk.letgoup.category_service.core.ports.out.CategoryRepositoryPort;
import com.ikucuk.letgoup.category_service.dto.CategoryDTO;
import com.ikucuk.letgoup.category_service.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreateCategoryUseCase implements CategoryServicePort {

    private final CategoryRepositoryPort categoryRepositoryPort;

    public CreateCategoryUseCase(CategoryRepositoryPort categoryRepositoryPort) {
        this.categoryRepositoryPort = categoryRepositoryPort;
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        CategoryEntity entity = CategoryMapper.categoryDTOToCategoryEntity(categoryDTO);

        Optional<CategoryDTO> optionalCategory = categoryRepositoryPort.findById(entity.getId());

        if (optionalCategory.isPresent()) {
            throw new IllegalStateException("Category id already registered with given id"
                    +entity.getId());
        }
        CategoryDTO savedCategory = categoryRepositoryPort.save(CategoryMapper.categoryEntityToCategoryDTO(entity));
        return savedCategory;
    }
}
