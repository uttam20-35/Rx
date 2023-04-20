package com.example.rx.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "uom")
public class UomEntity {
    @Id
    @Column(name = "unit", nullable = false)
    private String unit;

    @Column(name = "description")
    private String description;
}
