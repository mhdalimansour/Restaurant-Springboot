package com.restaurant.restaurant.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer extends User {

  @OneToOne(mappedBy = "customer")
  private Cart cart;

  @OneToMany(mappedBy = "customer")
  private List<Reviews> reviews;

  @OneToMany(mappedBy = "customer")
  private List<Order> orders;
}
