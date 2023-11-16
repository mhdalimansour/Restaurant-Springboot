package com.restaurant.restaurant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.restaurant.restaurant.entity.Restaurant;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class RestaurantCustomRepoImpl implements RestaurantCustomRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Restaurant> findBySlug(String slug) {
        String sql = "SELECT r from restaurant r WHERE r.slug=:slug";
        TypedQuery<Restaurant> query = entityManager.createQuery(sql, Restaurant.class);
        query.setParameter("slug", slug);
        return query.getResultList();
    }

}
