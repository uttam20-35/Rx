package com.example.rx.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "prescription")
public class PrescriptionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prescription_seq_id")
    @SequenceGenerator(name = "prescription_seq_id", sequenceName = "prescription_seq_id", initialValue = 701)
    @Column(name = "prescription_id", nullable = false)
    private Long prescriptionId;

    @Column(name = "no_of_days")
    private Integer noOfDays;

    @Column(name = "note")
    private String note;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "prescription_medication",
            joinColumns = @JoinColumn(name = "prescription_id", referencedColumnName = "prescription_id"),
            inverseJoinColumns = @JoinColumn(name = "medication_id", referencedColumnName = "medication_id")
    )
    private List<MedicationEntity> medicationEntityList;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "prescription_schedule",
            joinColumns = @JoinColumn(name = "prescription_id", referencedColumnName = "prescription_id"),
            inverseJoinColumns = @JoinColumn(name = "day_id", referencedColumnName = "day_id"))
    private List<DayEntity> dayEntityList;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dose_id")
    private DoseEntity doseEntity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medication_timing_id")
    private MedicationTimingEntity medicationTimingEntity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "encounter_id")
    private EncounterEntity encounterEntity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dose_frequency_id")
    private DoseFrequencyEntity doseFrequencyEntity;


    /* [mapping]
    dose-id, medication-timing-id, encounter-id, dose-frequency-type
     */
}
