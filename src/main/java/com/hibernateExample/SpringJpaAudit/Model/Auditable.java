package com.hibernateExample.SpringJpaAudit.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(value = AuditingEntityListener.class)
public class Auditable<T> {

    @CreatedBy
    @Column(name = "created_by", updatable = false)
    T createdBy;

    @CreatedDate
    @Column(name = "created_on", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    Date createdOn;

    @LastModifiedBy
    @Column(name = "Modified_by")
    T modifiedBy;

    @LastModifiedDate
    @Column(name=  "modified_on")
    @Temporal(TemporalType.TIMESTAMP)
    Date modifiedOn;
}
