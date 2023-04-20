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
@Entity(name = "medication_timing")
public class MedicationTimingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medication_timing_seq_id")
    @SequenceGenerator(name = "medication_timing_seq_id", sequenceName = "medication_timing_seq_id", initialValue = 5001)
    @Column(name = "medication_timing_id", nullable = false)
    private Long id;

    @Column(name = "medication_timing_type")
    private String medicationTimingType;
}
