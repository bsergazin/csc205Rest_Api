package com.example.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("restaurants")
public class Restaurant {
    String borough;
    String cuisine;
    String name;
    @Id
    String restaurant_id;

    public Restaurant(String borough, 
            String cuisine, String name, String restaurant_id) {
        borough = borough;
        cuisine = cuisine;
        name = name;
        restaurant_id = restaurant_id;
    }
}
