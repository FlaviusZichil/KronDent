package app.controllers;

import app.services.MedicalProcedureService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medical-procedure")
public class MedicalProcedureController {

    private final MedicalProcedureService medicalProcedureService;

    public MedicalProcedureController(MedicalProcedureService medicalProcedureService) {
        this.medicalProcedureService = medicalProcedureService;
    }
}
