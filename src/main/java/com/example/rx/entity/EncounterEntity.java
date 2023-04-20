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
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "encounter")
public class EncounterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "encounter_seq_id")
    @SequenceGenerator(name = "encounter_seq_id", sequenceName = "encounter_seq_id", initialValue = 501)
    @Column(name = "encounter_id", nullable = false)
    private Long encounterId;

    @Column(name = "encounter_date_time")
    private LocalDateTime encounterDateTime;

    /* [one to one mapping]
    provider-id/patient-id*/
}
