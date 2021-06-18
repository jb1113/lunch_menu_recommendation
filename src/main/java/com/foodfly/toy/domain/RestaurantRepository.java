package com.foodfly.toy.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    @Query("SELECT r " +
            "FROM Restaurant r " +
            "ORDER BY r.id DESC")
    Stream<Restaurant> findAllDesc();
}
