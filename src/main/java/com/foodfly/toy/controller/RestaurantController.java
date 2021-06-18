package com.foodfly.toy.controller;

import com.foodfly.toy.domain.RestaurantRepository;
import com.foodfly.toy.dto.RestaurantSaveRequestDto;
import com.foodfly.toy.service.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RestaurantController {

    // private RestaurantRepository restaurantRepository;
    private RestaurantService restaurantService;

    @PostMapping("/restaurant")
    public Long saveRestaurant(@RequestBody RestaurantSaveRequestDto dto) {
        // restaurantRepository.save(dto.toEntity());
        return restaurantService.save(dto);
    }
}
