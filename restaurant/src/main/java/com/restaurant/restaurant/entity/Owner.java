package com.restaurant.restaurant.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "owner")
public class Owner extends User {

  @OneToMany(mappedBy = "owner")
  List<Restaurant> restaurantsOwned;

}
