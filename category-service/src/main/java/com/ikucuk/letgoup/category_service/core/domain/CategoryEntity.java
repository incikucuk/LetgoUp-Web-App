package com.ikucuk.letgoup.category_service.core.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class CategoryEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    @NotNull(message = "Category name cannot be null")
    @NotEmpty(message = "Category name cannot be empty")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "parent_id")
    private CategoryEntity parent;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<CategoryEntity> subCategories = new HashSet<CategoryEntity>();

    private static final int MAX_LEVEL = 6;

    @CreatedDate
    @Column(nullable = false, name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @CreatedBy
    @Column(nullable = false, name = "created_by", updatable = false)
    private String createdBy;

    public void addSubCategory(CategoryEntity subCategory) {
        if (this.subCategories.size() >= MAX_LEVEL) {
            throw new IllegalStateException("Maximum subcategories limit reached.");
        }
        if (subCategory.getLevel() > MAX_LEVEL) {
            throw new IllegalStateException("Category level cannot exceed " + MAX_LEVEL);
        }
        this.subCategories.add(subCategory);
        subCategory.setParent(this);
    }

    public void removeSubCategory(Long subCategoryId) {
        this.subCategories.removeIf(sub -> sub.getId().equals(subCategoryId));
    }

    public int getLevel() {
        int level = 1;
        CategoryEntity current = this;
        while (current.getParent() != null) {
            level++;
            current = current.getParent();
        }
        return level;
    }
}
