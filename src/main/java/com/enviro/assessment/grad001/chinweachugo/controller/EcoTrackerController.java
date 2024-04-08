package com.enviro.assessment.grad001.chinweachugo.controller;

import com.enviro.assessment.grad001.chinweachugo.model.EcoTracker;
import com.enviro.assessment.grad001.chinweachugo.service.EcoTrackerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EcoTrackerController {

    Logger logger = LoggerFactory.getLogger(EcoTrackerController.class);
    @Autowired
    private EcoTrackerService trackerService;

    @PostMapping("/createEcoTracker")
    public ResponseEntity<EcoTracker> create(@RequestBody EcoTracker ecotracker){
        logger.info("Creating Eco-Tracker");
        trackerService.createEcoTracker(ecotracker);

        return ResponseEntity.ok(ecotracker);
    }

    @GetMapping("/getAllTrackers")
    public List<EcoTracker> getAllTracker(){

        return  trackerService.findAllTracker();
    }

    @GetMapping("/getTrackerById/{id}")
    public ResponseEntity<EcoTracker> getTrackerById(@PathVariable int id){

        logger.info("Getting Tracker by id");
        EcoTracker eco = trackerService.getTrackerById(id);

       return ResponseEntity.ok(eco);
    }

    @PutMapping("/updateTracker/{id}")
    public EcoTracker updateEcoTracker(@PathVariable int id,@RequestBody EcoTracker ecotracker) {

        logger.info("Updating tracker");
       return trackerService.updateTracker(id, ecotracker);
    }


    @DeleteMapping("/deleteTracker/{id}")
    public String deleteTracker(@PathVariable int id){

        logger.info("Deleting tracker...");
        return trackerService.deleteEcoTracker(id);
    }
}
