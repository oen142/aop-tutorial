package com.wani.aoptutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FilterController {


    @GetMapping("/filter/{id}")
    public ResponseEntity filter(@PathVariable Long id, @RequestBody FilterRequest filterRequest) {

        FilterResponse filterResponse = new FilterResponse(true, filterRequest.getTitle());
        return ResponseEntity.ok().body(filterResponse);
    }
}
