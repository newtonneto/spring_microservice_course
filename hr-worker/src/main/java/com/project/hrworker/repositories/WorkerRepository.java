package com.project.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
