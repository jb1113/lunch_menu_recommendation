package com.foodfly.toy.service;

import com.foodfly.toy.domain.RestaurantRepository;
import com.foodfly.toy.dto.RestaurantMainResponseDto;
import com.foodfly.toy.dto.RestaurantSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class RestaurantService {

    private RestaurantRepository restaurantRepository;

    @Transactional
    public Long save(RestaurantSaveRequestDto dto) {
        return restaurantRepository.save(dto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<RestaurantMainResponseDto> findAllDesc() {
        return restaurantRepository.findAllDesc()
                .map(RestaurantMainResponseDto::new)
                .collect(Collectors.toList());
    }
}
