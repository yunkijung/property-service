package com.loglrs.propertyservice.domain.member_house_like.entity;


import com.loglrs.propertyservice.domain.house.entity.House;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class MemberHouseLike {
    @Id
    @Column(name = "member_house_like_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "house_id")
    private House house;

    private Long memberId;

    public MemberHouseLike(House house, Long memberId) {
        this.house = house;
        this.memberId = memberId;
    }
}
