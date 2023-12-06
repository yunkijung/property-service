package com.loglrs.propertyservice.domain.house_offer_h.entity;


import com.loglrs.propertyservice.domain.common.auditor.AuditorEntity;
import com.loglrs.propertyservice.domain.house.entity.House;
import com.loglrs.propertyservice.domain.offer_h.entity.OfferH;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class HouseOfferH extends AuditorEntity {
    @Id
    @Column(name = "house_offer_h_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "house_id")
    private House house;

    @ManyToOne
    @JoinColumn(name = "offer_h_id")
    private OfferH offerH;

    public HouseOfferH(House house, OfferH offerH) {
        this.house = house;
        this.offerH = offerH;
    }
}
