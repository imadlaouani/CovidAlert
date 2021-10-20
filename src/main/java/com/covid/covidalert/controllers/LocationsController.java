package com.covid.covidalert.controllers;

import com.covid.covidalert.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.covid.covidalert.repositories.LocationRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/locations")
public class LocationsController {

    @Autowired
    private LocationRepository locationRepository;

    @GetMapping
    public List<Location> list() {
        return locationRepository.findAll();
    }
    @GetMapping
    @RequestMapping("{id}")
    public Location get(@PathVariable Long id) {
        return locationRepository.getById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Location create(@RequestBody final Location location) {
        return  locationRepository.saveAndFlush(location);
    }
}
