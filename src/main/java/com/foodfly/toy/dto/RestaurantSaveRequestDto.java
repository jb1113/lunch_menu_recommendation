package com.foodfly.toy.dto;

import com.foodfly.toy.domain.Restaurant;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RestaurantSaveRequestDto {

    private String name;
    private String address;

    @Builder
    public RestaurantSaveRequestDto(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Restaurant toEntity() {
        return Restaurant.builder()
                .name(name)
                .address(address)
                .build();
    }
}
