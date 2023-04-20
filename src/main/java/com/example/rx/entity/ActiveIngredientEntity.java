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
@Entity(name = "active_ingredient")
public class ActiveIngredientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "active_ingredient_seq_id")
    @SequenceGenerator(name = "active_ingredient_seq_id", sequenceName = "active_ingredient_seq_id", initialValue = 2001)
    @Column(name = "active_ingredient_id", nullable = false)
    private Long activeIngredientId;

    @Column(name = "name")
    private String nameOfIngredient;
}
