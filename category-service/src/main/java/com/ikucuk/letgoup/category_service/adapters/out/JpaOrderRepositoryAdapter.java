package com.ikucuk.letgoup.category_service.adapters.out;

import com.ikucuk.letgoup.category_service.core.domain.entity.category.CategoryEntity;
import com.ikucuk.letgoup.category_service.core.ports.out.CategoryRepositoryPort;
import org.springframework.data.jpa.repository.JpaRepository;

public class JpaOrderRepositoryAdapter implements CategoryRepositoryPort {
    interface JpaCategoryRepository extends JpaRepository<CategoryEntity, Long> {

    }

    private final JpaCategoryRepository jpaOrderRepository;

    public JpaOrderRepositoryAdapter(JpaCategoryRepository jpaOrderRepository) {
        this.jpaOrderRepository = jpaOrderRepository;
    }


    @Override
    public void save(CategoryEntity category) {

    }

    @Override
    public CategoryEntity findById(Long id) {
        return null;
    }
}
