package com.loglrs.propertyservice.domain.offer_h.entity;


import com.loglrs.propertyservice.domain.common.auditor.AuditorEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class OfferH extends AuditorEntity {
    @Id
    @Column(name = "offer_h_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String description;

    public OfferH(String type, String description) {
        this.type = type;
        this.description = description;
    }
}
