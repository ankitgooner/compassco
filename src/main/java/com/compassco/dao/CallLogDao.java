package com.compassco.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compassco.entity.CallLogEntity;
import com.compassco.repository.CallRepository;

@Service
public class CallLogDao {
	
@Autowired	
CallRepository callRepository;

public List<CallLogEntity> getAll() {
	
	
	return callRepository.findAll();
	
}

public CallLogEntity saveCallLog(CallLogEntity entity) {
	
	return callRepository.save(entity);
	
	
}

}
