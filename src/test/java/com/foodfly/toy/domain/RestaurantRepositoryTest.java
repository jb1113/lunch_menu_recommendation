package com.foodfly.toy.domain;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantRepositoryTest {

    @Autowired
    RestaurantRepository restaurantRepository;

    @After
    public void cleanup() {
        /**
         *  이후 테스트 코드에 영향을 끼치지 않기 위해
         *  테스트 메소드가 끝날때 마다 repository 전체를 비우는 코드
         */
        restaurantRepository.deleteAll();
    }

    @Test
    public void readRestaurant() {
        // given
        restaurantRepository.save(Restaurant.builder()
                .name("사랑밥상")
                .address("서울특별시 서초구 서초동 1502-1 번지 하")
                .build());

        // when
        List<Restaurant> restaurantList = restaurantRepository.findAll();

        // then
        Restaurant restaurant = restaurantList.get(0);
        assertThat(restaurant.getName(), is("사랑밥상"));
        assertThat(restaurant.getAddress(), is("서울특별시 서초구 서초동 1502-1 번지 하"));
    }
}
