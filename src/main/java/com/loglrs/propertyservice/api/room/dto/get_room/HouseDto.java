package com.loglrs.propertyservice.api.room.dto.get_room;




import com.loglrs.propertyservice.api.house.dto.get_options.OfferHDto;
import com.loglrs.propertyservice.api.house.dto.get_options.RuleHDto;
import com.loglrs.propertyservice.api.house.dto.search_houses.ImageDto;
import com.loglrs.propertyservice.api.house.dto.search_houses.RoomDto;
import com.loglrs.propertyservice.domain.house.entity.House;
import com.loglrs.propertyservice.domain.house_offer_h.entity.HouseOfferH;
import com.loglrs.propertyservice.domain.house_rule_h.entity.HouseRuleH;
import com.loglrs.propertyservice.domain.image.entity.Image;
import com.loglrs.propertyservice.domain.room.entity.Room;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
public class HouseDto {
    private Long houseId;
    private String title;
    private String description;
    private String type;
    private String street;
    private String city;
    private String country;
    private String postalCode;

    private int roomCount;
    private int washroomCount;
    private int toiletCount;
    private int kitchenCount;
    private int livingRoomCount;

    private Double longitude;
    private Double latitude;
    private List<ImageDto> images;
    private List<OfferHDto> houseOffers;
    private List<RuleHDto> houseRules;
    private List<RoomDto> rooms;

    public HouseDto(House house) {
        List<Image> images = house.getImages();
        List<ImageDto> imageDtos = new ArrayList<>();
        for (Image image : images) {
            imageDtos.add(new ImageDto(image));
        }

        List<HouseOfferH> houseOfferHList = house.getHouseOfferHList();
        List<OfferHDto> offerHDtos = new ArrayList<>();
        for (HouseOfferH houseOfferH : houseOfferHList) {
            offerHDtos.add(new OfferHDto(houseOfferH.getOfferH()));
        }

        List<HouseRuleH> houseRuleHList = house.getHouseRuleHList();
        List<RuleHDto> ruleHDtos = new ArrayList<>();
        for (HouseRuleH houseRuleH : houseRuleHList) {
            ruleHDtos.add(new RuleHDto(houseRuleH.getRuleH()));
        }

        //Room from house data transfer
        List<Room> rooms = house.getRooms();
        List<RoomDto> roomDtos = new ArrayList<>();
        for (Room roomFromHouse : rooms) {
//            if(roomFromHouse.getId().equals(roomId)) continue; //skip the room of path variable
            roomDtos.add(new RoomDto(roomFromHouse));
        }

        this.houseId = house.getId();
        this.title = house.getTitle();
        this.description = house.getDescription();
        this.type = house.getType();
        this.street = house.getAddress().getStreet();
        this.city = house.getAddress().getCity();
        this.country = house.getAddress().getCountry();
        this.postalCode = house.getAddress().getPostalCode();
        this.roomCount = house.getRoomCount();
        this.washroomCount = house.getWashroomCount();
        this.toiletCount = house.getToiletCount();
        this.kitchenCount = house.getKitchenCount();
        this.livingRoomCount = house.getLivingRoomCount();
        this.longitude = house.getPoint().getX();
        this.latitude = house.getPoint().getY();
        this.images =  imageDtos;
        this.houseOffers =  offerHDtos;
        this.houseRules =  ruleHDtos;
        this.rooms =  roomDtos;
    }
}
