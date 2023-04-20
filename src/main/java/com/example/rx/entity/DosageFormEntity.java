package com.example.rx.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "dosage_form")
public class DosageFormEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dosage_form_seq_id")
    @SequenceGenerator(name = "dosage_form_seq_id", sequenceName = "dosage_form_seq_id", initialValue = 4001)
    @Column(name = "dosage_form_id", nullable = false)
    private Long dosageFormId;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codesystem_id")
    private CodeSystemEntity codeSystemEntity;

    /* One to one relation
    snomed_ct-id*/
}
