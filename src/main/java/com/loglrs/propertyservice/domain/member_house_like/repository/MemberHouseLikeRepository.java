package com.loglrs.propertyservice.domain.member_house_like.repository;


import com.loglrs.propertyservice.domain.member_house_like.entity.MemberHouseLike;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberHouseLikeRepository extends JpaRepository<MemberHouseLike, Long> {
    List<MemberHouseLike> findByMemberId(Long id);

    void deleteByMemberIdAndHouseId(Long memberId, Long houseId);
}
