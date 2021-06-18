package com.foodfly.toy.service;

import com.foodfly.toy.domain.Restaurant;
import com.foodfly.toy.domain.RestaurantRepository;
import com.foodfly.toy.dto.RestaurantSaveRequestDto;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantServiceTest {

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private RestaurantRepository restaurantRepository;

    @After
    public void cleanup() {
        restaurantRepository.deleteAll();
    }

    @Test
    public void saveDtoToRestaurantTable() {
        // given
        RestaurantSaveRequestDto dto = RestaurantSaveRequestDto.builder()
                .name("사랑밥상")
                .address("서울특별시 서초구 서초동 1502-1 번지 하")
                .build();

        // when
        restaurantService.save(dto);

        // then
        Restaurant restaurant = restaurantRepository.findAll().get(0);
        assertThat(restaurant.getName()).isEqualTo(dto.getName());
        assertThat(restaurant.getAddress()).isEqualTo(dto.getAddress());
    }
}
