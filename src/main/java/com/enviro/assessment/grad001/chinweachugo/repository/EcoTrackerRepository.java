package com.enviro.assessment.grad001.chinweachugo.repository;

import com.enviro.assessment.grad001.chinweachugo.model.EcoTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcoTrackerRepository extends JpaRepository<EcoTracker,Integer> {

}
