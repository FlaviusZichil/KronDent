package app.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MEDICAL_PROCEDURE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalProcedure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PROCEDURE_ID", unique = true, nullable = false)
    private Long procedureId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private Double price;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    private Category category;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "medicalProcedure")
    private List<Appointment> appointments;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<TreatmentPlan> treatmentPlans;
}
