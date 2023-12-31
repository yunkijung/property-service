package com.loglrs.propertyservice.api.house.dto.get_options;


import com.loglrs.propertyservice.domain.offer_h.entity.OfferH;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OfferHDto {
    private Long offerHId;
    private String type;
    private String description;

    public OfferHDto(OfferH offerH) {
        this.offerHId = offerH.getId();
        this.type = offerH.getType();
        this.description = offerH.getDescription();
    }
}
