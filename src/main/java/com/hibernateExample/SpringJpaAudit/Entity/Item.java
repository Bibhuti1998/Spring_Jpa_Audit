package com.hibernateExample.SpringJpaAudit.Entity;

import com.hibernateExample.SpringJpaAudit.Model.Auditable;
import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Item extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(nullable = false)
    String itemName;

    @Column(nullable = false)
    Long price;

    String promoCode;
}
