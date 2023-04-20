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
@Entity(name = "dose")
public class DoseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dose_seq_id")
    @SequenceGenerator(name = "dose_seq_id", sequenceName = "dose_seq_id", initialValue = 7001)
    @Column(name = "dose_id", nullable = false)
    private Long doseId;

    @Column(name = "dose_type")
    private String doseType;
}
