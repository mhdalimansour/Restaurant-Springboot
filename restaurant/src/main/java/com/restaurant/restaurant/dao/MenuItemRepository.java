package com.restaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.restaurant.entity.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {

}
