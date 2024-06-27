package com.myhealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.myhealth.model.Activity;
import com.myhealth.service.ActivityService;

import java.util.List;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping
    public List<Activity> getActivities() {
        return activityService.getAllActivities();
    }

    @PostMapping
    public Activity addActivity(@RequestBody Activity activity) {
        return activityService.saveActivity(activity);
    }
}
