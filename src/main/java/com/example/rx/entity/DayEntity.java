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
@Entity(name = "day")
public class DayEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "day_seq_id")
    @SequenceGenerator(name = "day_seq_id", sequenceName = "day_seq_id", allocationSize = 8,initialValue = 1)
    @Column(name = "day_id", nullable = false)
    private Long dayId;

    @Column(name = "name")
    private String name;
}
