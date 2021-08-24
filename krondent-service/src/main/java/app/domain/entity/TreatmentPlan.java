package app.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TREATMENT_PLAN")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreatmentPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TREATMENT_PLAN_ID", unique = true, nullable = false)
    private Long treatmentPlanId;

    @Column(name = "NAME")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User pacient;

    // was not mapped as FK because hibernate does not allow to map same column twice on one entity
    @Column(name = "DOCTOR_ID")
    private Long doctorId;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<MedicalProcedure> medicalProcedures;
}
