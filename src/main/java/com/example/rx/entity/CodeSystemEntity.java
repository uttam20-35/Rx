package com.example.rx.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "code_system")
public class CodeSystemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "code_system_seq_id")
    @SequenceGenerator(name = "code_system_seq_id", sequenceName = "code_system_seq_id", initialValue = 1)
    @Column(name = "codesystem_id", nullable = false)
    private Long codeSystemId;

    @Column(name = "code")
    private String code;

    @Column(name = "display_name")
    private String displayName;
}
