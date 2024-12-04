package com.ikucuk.letgoup.category_service.adapters.out;

import com.ikucuk.letgoup.category_service.core.domain.CategoryEntity;
import com.ikucuk.letgoup.category_service.core.ports.out.CategoryRepositoryPort;
import com.ikucuk.letgoup.category_service.dto.CategoryDTO;
import com.ikucuk.letgoup.category_service.mapper.CategoryMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class JpaCategoryRepositoryAdapter implements CategoryRepositoryPort {

    private final JpaCategoryRepository jpaOrderRepository;

    public JpaCategoryRepositoryAdapter(JpaCategoryRepository jpaOrderRepository) {
        this.jpaOrderRepository = jpaOrderRepository;
    }

    @Override
    public CategoryDTO save(CategoryDTO categoryDto) {

       jpaOrderRepository.save(
               CategoryMapper.categoryDTOToCategoryEntity(categoryDto));
        return categoryDto;
    }

    @Override
    public Optional<CategoryDTO> findById(Long id) {
        return Optional.of(
                CategoryMapper.categoryEntityToCategoryDTO(
                        jpaOrderRepository.findById(id).orElseThrow(() -> new IllegalStateException("Category not found with id: "+id))
                )
        );
    }

    // JpaRepository implementasyonu
    interface JpaCategoryRepository extends JpaRepository<CategoryEntity, Long> {
    }
}
