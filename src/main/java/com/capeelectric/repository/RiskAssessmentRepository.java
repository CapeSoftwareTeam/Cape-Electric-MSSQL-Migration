package com.capeelectric.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capeelectric.model.RiskAssessmentDetails;

@Repository
public interface RiskAssessmentRepository extends CrudRepository<RiskAssessmentDetails, Integer> {

}
