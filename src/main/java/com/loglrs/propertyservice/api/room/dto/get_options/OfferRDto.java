package com.loglrs.propertyservice.api.room.dto.get_options;


import com.loglrs.propertyservice.domain.offer_r.entity.OfferR;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OfferRDto {
    private Long offerRId;
    private String type;
    private String description;

    public OfferRDto(OfferR offerR) {
        this.offerRId = offerR.getId();
        this.type = offerR.getType();
        this.description = offerR.getDescription();
    }
}
