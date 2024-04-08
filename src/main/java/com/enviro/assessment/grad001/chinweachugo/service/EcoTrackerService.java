package com.enviro.assessment.grad001.chinweachugo.service;

import com.enviro.assessment.grad001.chinweachugo.exception.ResourcesNotFoundException;
import com.enviro.assessment.grad001.chinweachugo.model.EcoTracker;
import com.enviro.assessment.grad001.chinweachugo.repository.EcoTrackerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcoTrackerService {

    @Autowired
     private EcoTrackerRepository ecorepo;

  public  EcoTracker createEcoTracker(EcoTracker ecotracker){

       return ecorepo.save(ecotracker);
    }

    public List<EcoTracker> findAllTracker(){

      return ecorepo.findAll();
    }

    public EcoTracker getTrackerById (int id) {

        return ecorepo.findById(id)
                .orElseThrow(() -> new ResourcesNotFoundException("Record Not found"));
    }

    public EcoTracker updateTracker(int id, EcoTracker ecotracker){

      EcoTracker trackerUpdate = ecorepo.findById(id)
              .orElseThrow(() -> new ResourcesNotFoundException("Record Not Found"));
      trackerUpdate.setLocation(ecotracker.getLocation());
      trackerUpdate.setWastManagement(ecotracker.getWastManagement());
      trackerUpdate.setRecycling(ecotracker.getRecycling());
      trackerUpdate.setFloodRisk(ecotracker.getFloodRisk());
      return ecorepo.save(trackerUpdate);
    }

    public String deleteEcoTracker(int id){

      EcoTracker ecotracker = ecorepo.findById(id)
              .orElseThrow(()-> new ResourcesNotFoundException("Resource Not Found"));
      ecorepo.delete(ecotracker);
      return "Record number " + id + " deleted";
    }
}
