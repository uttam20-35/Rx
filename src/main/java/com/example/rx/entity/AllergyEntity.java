package com.example.rx.entity;


import lombok.AccessLevel;
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
@Entity(name = "allergy")
public class AllergyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "allergy_seq_id")
    @SequenceGenerator(name = "allergy_seq_id", sequenceName = "allergy_seq_id", initialValue = 101)
    @Column(name = "allergy_id", nullable = false)
    private Long allergyId;

    @Column(name = "name")
    private String name;
}
