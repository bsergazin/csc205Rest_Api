package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repositories.RestaurantRepository;
import java.util.List;
import com.example.demo.Models.Restaurant;


@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    @Autowired
    RestaurantRepository restaurantRepository;

    @GetMapping("/{borough}")
    public ResponseEntity<List<Restaurant>> getRestaurantByBorough(
            @PathVariable(value = "borough") String boroughName) {
        var result = restaurantRepository.findRestaurantByBorough(boroughName);

        if (result!=null) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.notFound().build();

        }
    }
}
