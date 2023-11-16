package com.restaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.restaurant.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {

}
