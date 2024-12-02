package com.ikucuk.letgoup.category_service.core.usecases;

import com.ikucuk.letgoup.category_service.core.domain.CategoryEntity;
import com.ikucuk.letgoup.category_service.core.ports.out.CategoryRepositoryPort;
import com.ikucuk.letgoup.category_service.dto.CategoryDTO;
import com.ikucuk.letgoup.category_service.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreateCategoryUseCase implements CreateCategoryService {

    private final CategoryRepositoryPort categoryRepositoryPort;

    public CreateCategoryUseCase(CategoryRepositoryPort categoryRepositoryPort) {
        this.categoryRepositoryPort = categoryRepositoryPort;
    }

    @Override
    public void createCategory(CategoryDTO categoryDTO) {
        CategoryEntity entity = CategoryMapper.categoryDTOToCategoryEntity(categoryDTO);

        Optional<CategoryDTO> optionalCategory = categoryRepositoryPort.findById(entity.getId());

        if (optionalCategory.isPresent()) {
            throw new IllegalStateException("Category id already registered with given id"
                    +entity.getId());
        }
        categoryRepositoryPort.save(CategoryMapper.categoryEntityToCategoryDTO(entity));
    }
}
