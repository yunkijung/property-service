package com.loglrs.propertyservice.api.house.dto.search_houses;

import com.loglrs.propertyservice.api.room.dto.get_options.OfferRDto;
import com.loglrs.propertyservice.domain.image.entity.Image;
import com.loglrs.propertyservice.domain.room.entity.Room;
import com.loglrs.propertyservice.domain.room_offer_r.entity.RoomOfferR;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
//@AllArgsConstructor
public class RoomDto {
    private Long roomId;
    private String title;
    private String description;
    private Integer floor;
    private int price;
    private int minStay;
    private Boolean isOn;
    private LocalDate availableDate;
    private List<ImageDto> images;
    private List<OfferRDto> roomOffers;

    public RoomDto(Room room) {
        List<Image> roomImages = room.getImages();
        List<ImageDto> roomImageDtos = new ArrayList<>();
        for (Image roomImage : roomImages) {
            roomImageDtos.add(new ImageDto(roomImage));
        }

        List<RoomOfferR> roomOfferRList = room.getRoomOfferRList();
        List<OfferRDto> roomOfferRDtos = new ArrayList<>();
        for (RoomOfferR roomOfferR : roomOfferRList) {
            roomOfferRDtos.add(new OfferRDto(roomOfferR.getOfferR()));
        }

        this.roomId = room.getId();
        this.title = room.getTitle();
        this.description = room.getDescription();
        this.floor = room.getFloor();
        this.price = room.getPrice();
        this.minStay = room.getMinStay();
        this.isOn = room.getIsOn();
        this.availableDate = room.getAvailableDate();
        this.images = roomImageDtos;
        this.roomOffers = roomOfferRDtos;
    }
}
