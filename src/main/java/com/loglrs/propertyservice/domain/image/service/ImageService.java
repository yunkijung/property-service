package com.loglrs.propertyservice.domain.image.service;

import com.loglrs.propertyservice.domain.image.entity.Image;
import com.loglrs.propertyservice.domain.image.repository.ImageRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ImageService {
    private final ImageRepository imageRepository;

    @Transactional
    public Image saveImage(Image image) {
        return imageRepository.save(image);
    }
}
