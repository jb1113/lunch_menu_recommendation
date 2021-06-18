package com.foodfly.toy.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 500, nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String address;

    private int lat;

    private int lng;

    @Builder
    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

}
