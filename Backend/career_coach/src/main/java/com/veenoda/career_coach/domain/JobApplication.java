package com.veenoda.career_coach.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "job_applications")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String companyName;

    @Column
    private String jobRole;

    @Column
    private String description;

    @Column
    private String status;

    @OneToOne(mappedBy = "jobApplication", cascade = CascadeType.ALL)
    private AiFeedback aiFeedback;

}
