package com.loglrs.propertyservice.domain.room_offer_r.entity;


import com.loglrs.propertyservice.domain.common.auditor.AuditorEntity;
import com.loglrs.propertyservice.domain.offer_r.entity.OfferR;
import com.loglrs.propertyservice.domain.room.entity.Room;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class RoomOfferR extends AuditorEntity {
    @Id
    @Column(name="room_offer_r_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "offer_r_id")
    private OfferR offerR;

    public RoomOfferR(Room room, OfferR offerR) {
        this.room = room;
        this.offerR = offerR;
    }
}
