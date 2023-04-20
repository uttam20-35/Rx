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
import javax.persistence.SequenceGenerator;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "medication")
public class MedicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medication_seq_id")
    @SequenceGenerator(name = "medication_seq_id", sequenceName = "medication_seq_id", initialValue = 1001)
    @Column(name = "medication_id", nullable = false)
    private Long medicationId;

    @Column(name = "description")
    private String description;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "strength")
    private Integer strength;

    @Column(name = "otc")
    private Boolean isOtc;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "medication_warning"
            , joinColumns = @JoinColumn(name = "medication_id", referencedColumnName = "medication_id")
            , inverseJoinColumns = @JoinColumn(name = "warning_id", referencedColumnName = "warning_id"))
    private List<WarningEntity> warningEntityList;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "medication_active_ingredient"
            , joinColumns = @JoinColumn(name = "medication_id", referencedColumnName = "medication_id")
            , inverseJoinColumns = @JoinColumn(name = "active_ingredient_id", referencedColumnName = "active_ingredient_id"))
    private List<ActiveIngredientEntity> activeIngredientEntityList;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "medication_allergy"
            , joinColumns = @JoinColumn(name = "medication_id", referencedColumnName = "medication_id")
            , inverseJoinColumns = @JoinColumn(name = "allergy_id", referencedColumnName = "allergy_id"))
    private List<AllergyEntity> allergyEntityList;

    /*      [M2M tables]
             unit,dosage-form-id,route-id,codesystem-id
    */
}
