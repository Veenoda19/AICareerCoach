package com.veenoda.career_coach.repository;

import com.veenoda.career_coach.domain.AiFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AiFeedbackRepository extends JpaRepository<AiFeedback, Integer> {
}
