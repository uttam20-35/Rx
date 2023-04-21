package com.example.rx.controller;

import com.example.rx.model.Prescription;
import com.example.rx.response.PrescriptionResponse;
import com.example.rx.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Tag(name = "Create Prescription", description = "Create Prescription")
@RequestMapping(path = "/v1")
@RestController
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

//    @ApiResponse(responseCode = "200", description = "Success")
//    @ApiResponse(responseCode = "400", description = "Invalid request")
//    @ApiResponse(responseCode = "404", description = "Not found")
//    @ApiResponse(responseCode = "500", description = "System error")
    @PostMapping(value = "/prescriptions", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PrescriptionResponse> createPrescription(@PathVariable Long prescriptionId, @RequestBody Prescription prescription) {
        PrescriptionResponse prescriptionResponse = prescriptionService.createPrescription(prescriptionId, prescription);
        return new ResponseEntity<>(prescriptionResponse, HttpStatus.OK);
    }
}
