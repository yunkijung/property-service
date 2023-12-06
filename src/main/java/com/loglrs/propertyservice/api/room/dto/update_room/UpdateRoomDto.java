package com.loglrs.propertyservice.api.room.dto.update_room;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class UpdateRoomDto {
    private String title;
    private String description;
    private Integer floor;
    private int price;
    private int minStay;
    private LocalDate availableDate;
    private List<Long> addedOffers;
    private List<Long> deletedOffers;
    private List<String> deletedFiles;
}
