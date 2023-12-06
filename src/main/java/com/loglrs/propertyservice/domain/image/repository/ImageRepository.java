package com.loglrs.propertyservice.domain.image.repository;

import com.loglrs.propertyservice.domain.image.entity.Image;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
