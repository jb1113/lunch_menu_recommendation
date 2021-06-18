package com.foodfly.toy.dto;

import com.foodfly.toy.domain.Restaurant;
import lombok.Getter;

@Getter
public class RestaurantMainResponseDto {
    private Long id;
    private String name;
    private String address;
    private int lat;
    private int lng;

    public RestaurantMainResponseDto(Restaurant entity) {
        id = entity.getId();
        name = entity.getName();
        address = entity.getAddress();
        lat = entity.getLat();
        lng = entity.getLng();
    }
}
