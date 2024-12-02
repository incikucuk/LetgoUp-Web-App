package com.ikucuk.letgoup.category_service.core.domain.entity.base;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @CreatedDate
    @Column(nullable = false, name = "created_at", updatable = false)
    protected LocalDateTime createdAt;

    @CreatedBy
    @Column(nullable = false, name = "created_by", updatable = false)
    protected String createdBy;

    @LastModifiedDate
    @Column(nullable = false, name = "revised_at")
    protected LocalDateTime revisedAt;

    @Column(name = "active")
    protected boolean active = true;

}
