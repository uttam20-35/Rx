package com.example.rx.model;
import com.example.rx.entity.AllergyEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Medication {

    private String description;

    private String name;

    private String code;

    private Integer strength;

    private Boolean isOtc;

    private List<Warning> warningList;

    private List<ActiveIngredient> activeIngredientList;

    private List<Allergy> allergyList;


}
