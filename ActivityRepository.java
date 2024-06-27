package com.myhealth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myhealth.model.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
