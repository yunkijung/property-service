package com.loglrs.propertyservice.domain.offer_r.repository;

import com.loglrs.propertyservice.domain.offer_r.entity.OfferR;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfferRRepository extends JpaRepository<OfferR, Long> {
    List<OfferR> findAllByIdIn(List<Long> ids);
}
