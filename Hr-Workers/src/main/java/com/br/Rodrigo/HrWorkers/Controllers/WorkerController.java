package com.br.Rodrigo.HrWorkers.Controllers;

import java.util.List;

import com.br.Rodrigo.HrWorkers.Repository.WorkerRepository;
import com.br.Rodrigo.HrWorkers.entities.Worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * WorkerController
 */
@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
         List<Worker> list = workerRepository.findAll();
         return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
        Worker worker = workerRepository.findById(id).get();
        return ResponseEntity.ok(worker);
    }
}
