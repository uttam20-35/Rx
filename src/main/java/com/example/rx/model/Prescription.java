package com.example.rx.model;

import com.example.rx.entity.DayEntity;
import com.example.rx.entity.DoseEntity;
import com.example.rx.entity.DoseFrequencyEntity;
import com.example.rx.entity.EncounterEntity;
import com.example.rx.entity.MedicationEntity;
import com.example.rx.entity.MedicationTimingEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Prescription {

    private Integer noOfDays;

    private String note;

    private List<Medication> medicationList;

    private List<Day> dayList;

    private Dose dose;

    private MedicationTiming medicationTiming;

    private Encounter encounter;

    private DoseFrequency doseFrequency;
}
