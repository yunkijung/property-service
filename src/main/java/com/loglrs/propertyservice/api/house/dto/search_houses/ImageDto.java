package com.loglrs.propertyservice.api.house.dto.search_houses;


import com.loglrs.propertyservice.domain.image.entity.Image;
import lombok.Data;

@Data
public class ImageDto {
    private Long imageId;
    private String originFilename;
    private String fileUrl;

    public ImageDto(Image image) {
        this.imageId = image.getId();
        this.originFilename = image.getOriginFilename();
        this.fileUrl = image.getFileUrl();
    }
}
