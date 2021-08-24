package app.services;

import app.repositories.MedicalProcedureRepository;
import org.springframework.stereotype.Service;

@Service
public class MedicalProcedureService {

    private final MedicalProcedureRepository medicalProcedureRepository;

    public MedicalProcedureService(MedicalProcedureRepository medicalProcedureRepository) {
        this.medicalProcedureRepository = medicalProcedureRepository;
    }
}
