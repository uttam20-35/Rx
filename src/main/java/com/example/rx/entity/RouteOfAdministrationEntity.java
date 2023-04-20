package com.example.rx.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "route_of_administration")
public class RouteOfAdministrationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "route_of_administration_seq_id")
    @SequenceGenerator(name = "route_of_administration_seq_id", sequenceName = "route_of_administration_seq_id", initialValue = 6001)
    @Column(name = "route_id", nullable = false)
    private Long routeOfAdministrationId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "fda_code")
    private Integer fdaCode;
}
