package com.microservice.customerrewards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.customerrewards.model.CustomerRewards;
import com.microservice.customerrewards.model.RewardPoints;
import com.microservice.customerrewards.service.CustomerRewardsService;

@RestController
public class CustomerRewardsController {
	
	@Autowired
	private CustomerRewardsService service;
	
	@RequestMapping("/rewardPoints")
	public RewardPoints getAllTopics() {
		return service.getAllRewardPoints();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/customer-rewards")
	public void addTopic(@RequestBody List<CustomerRewards> topics) {
		service.addCutomerRewards(topics);
	}

}
