package com.microservice.customerrewards.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservice.customerrewards.model.CustomerRewards;


public interface CustomerRewardsRepository  extends CrudRepository<CustomerRewards, String> {

}
