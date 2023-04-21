package com.example.rx.mapper;

import com.example.rx.entity.PrescriptionEntity;
import com.example.rx.model.Prescription;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PrescriptionMapper {
    @Mapping(source = "medicationList",target = "medicationEntityList")
    @Mapping(source = "dayList",target = "dayEntityList")
    @Mapping(source = "dose",target = "doseEntity")
    @Mapping(source = "medicationTiming",target = "medicationTimingEntity")
    @Mapping(source = "encounter",target = "encounterEntity")
    @Mapping(source = "doseFrequency",target = "doseFrequencyEntity")
    PrescriptionEntity modelToEntity(Prescription prescription);

    @Mapping(source = "medicationEntityList",target = "medicationList")
    @Mapping(source = "dayEntityList",target = "dayList")
    @Mapping(source = "doseEntity",target = "dose")
    @Mapping(source = "medicationTimingEntity",target = "medicationTiming")
    @Mapping(source = "encounterEntity",target = "encounter")
    @Mapping(source = "doseFrequencyEntity",target = "doseFrequency")
    Prescription entityToModel(PrescriptionEntity prescriptionEntity);
}
