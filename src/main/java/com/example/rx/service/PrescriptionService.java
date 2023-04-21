package com.example.rx.service;

import com.example.rx.entity.PrescriptionEntity;
import com.example.rx.mapper.PrescriptionMapper;
import com.example.rx.model.Prescription;
import com.example.rx.repository.PrescriptionRepository;
import com.example.rx.response.PrescriptionResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PrescriptionService {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    @Autowired
    private PrescriptionMapper prescriptionMapper;

    public PrescriptionResponse createPrescription(Long prescriptionId, Prescription prescription) {
        log.info("Adding Prescription");

        PrescriptionEntity prescriptionEntity = prescriptionMapper.modelToEntity(prescription);
        prescriptionRepository.save(prescriptionEntity);
        log.info("Prescription Saved Successfully...!");

        PrescriptionResponse prescriptionResponse = new PrescriptionResponse();
        prescriptionResponse.setPrescriptionId(prescriptionEntity.getPrescriptionId());
        log.info("Prescription ID {}", prescriptionResponse.getPrescriptionId());

        return prescriptionResponse;
    }
}
