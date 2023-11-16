package com.restaurant.restaurant.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.restaurant.dao.RestaurantRepository;
import com.restaurant.restaurant.entity.Restaurant;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantRepository repository;

    @GetMapping("/restaurants/{slug}")
    List<Restaurant> findBySlug(@PathVariable("slug") String slug) {
        return repository.findBySlug(slug);
    }

}
