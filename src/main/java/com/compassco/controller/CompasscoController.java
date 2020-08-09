package com.compassco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.compassco.dao.CallLogDao;
import com.compassco.entity.CallLogEntity;

@RestController
public class CompasscoController {

@Autowired	
CallLogDao callogDao;	


	@PostMapping("/logCall")
    public CallLogEntity addLog(@RequestBody CallLogEntity entity) {
		
		
		return callogDao.saveCallLog(entity);
	}
	
	@GetMapping("/getCallLog")
    public List<CallLogEntity> getAllLogs() {
		
		
		return callogDao.getAll();
	}
}
