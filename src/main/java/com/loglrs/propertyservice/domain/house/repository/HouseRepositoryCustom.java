package com.loglrs.propertyservice.domain.house.repository;

import com.loglrs.propertyservice.domain.house.entity.House;



import java.util.List;

public interface HouseRepositoryCustom {
    List<House> search(Double lng, Double lat, Double distance);
}
