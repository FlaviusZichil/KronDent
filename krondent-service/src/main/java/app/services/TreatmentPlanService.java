package app.services;

import app.repositories.TreatmentPlanRepository;
import org.springframework.stereotype.Service;

@Service
public class TreatmentPlanService {

    private final TreatmentPlanRepository treatmentPlanRepository;

    public TreatmentPlanService(TreatmentPlanRepository treatmentPlanRepository) {
        this.treatmentPlanRepository = treatmentPlanRepository;
    }
}
