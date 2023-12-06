package com.loglrs.propertyservice.domain.offer_h.repository;

import com.loglrs.propertyservice.domain.offer_h.entity.OfferH;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfferHRepository extends JpaRepository<OfferH, Long>, OfferHRepositoryCustom {
    List<OfferH> findAllByIdIn(List<Long> ids);

}
