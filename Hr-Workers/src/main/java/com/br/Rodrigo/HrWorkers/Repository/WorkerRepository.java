
package com.br.Rodrigo.HrWorkers.Repository;

import com.br.Rodrigo.HrWorkers.entities.Worker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
    
	
}
