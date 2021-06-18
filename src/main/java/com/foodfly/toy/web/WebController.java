package com.foodfly.toy.web;

import com.foodfly.toy.service.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {

    private RestaurantService restaurantService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("restaurant", restaurantService.findAllDesc());
        return "main";
    }
}
