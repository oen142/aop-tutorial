package com.wani.aoptutorial.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FilterRequest {

    private Long idx;
    private String title;
}
