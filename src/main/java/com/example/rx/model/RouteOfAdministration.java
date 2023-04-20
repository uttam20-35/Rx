package com.example.rx.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RouteOfAdministration {

    private String name;

    private String description;

    private String shortName;

    private Integer fdaCode;

}
