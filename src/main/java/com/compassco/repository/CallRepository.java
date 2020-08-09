package com.compassco.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.compassco.entity.CallLogEntity;

public interface CallRepository extends JpaRepository<CallLogEntity,Integer> {
	CallLogEntity findByCallerNumber(String name);
	
}
