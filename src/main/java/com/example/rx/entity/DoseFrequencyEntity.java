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
@Entity(name = "dose_frequency")
public class DoseFrequencyEntity {
    @Id
    @Column(name = "dose_frequency_id", nullable = false)
    private String doseFrequencyId;

    @Column(name = "dose_frequency_type")
    private String doseFrequencyType;
}
