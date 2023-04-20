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
@Entity(name = "warning")
public class WarningEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "warning_entity_seq_id")
    @SequenceGenerator(name = "warning_entity_seq_id", sequenceName = "warning_entity_seq_id", initialValue = 401)
    @Column(name = "warning_id", nullable = false)
    private Long warningId;

    @Column(name = "warning_description")
    private String warningDescription;
}

