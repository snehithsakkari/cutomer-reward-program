package com.microservice.customerrewards.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.customerrewards.model.CustomerRewards;
import com.microservice.customerrewards.model.RewardPoints;
import com.microservice.customerrewards.repository.CustomerRewardsRepository;

@Service
public class CustomerRewardsService {
	
	@Autowired
	private CustomerRewardsRepository repo;
	

	public RewardPoints getAllRewardPoints() {
		
		RewardPoints rewards = new RewardPoints();
		List<CustomerRewards> topics = this.getRewardPoints();
		topics.stream().forEach(topic -> {
			float amount = 0;
			if(topic.getTransactionAmount() <= 50) {
				amount = amount + 0;
			}
			else if(topic.getTransactionAmount() <= 100) {
				amount = amount + (topic.getTransactionAmount() - 50);
			}
			else if(topic.getTransactionAmount() > 100) {
				amount = amount + (topic.getTransactionAmount() - 100)*2 + 50;
			}
			
			rewards.setRewardPoints(amount);
		});
		
		return rewards;
		
	}
 
	public List<CustomerRewards> getRewardPoints(){
		
		List<CustomerRewards> topics = new ArrayList<>();
		repo.findAll().forEach(topics::add);
		return topics;
	}

	public void addCutomerRewards(List<CustomerRewards> topics) {
		repo.saveAll(topics);
		
	}

}
