package com.restaurant.restaurant.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "restaurant_id")
  private int id;

  @Column(name = "restaurant_name")
  private String name;

  @Column(name = "location")
  private String location;

  @Column(name = "slug")
  private String slug;

  @ManyToOne
  @JoinColumn(name = "owner_id")
  private Owner owner;

  @OneToMany(mappedBy = "restaurant")
  private List<MenuItem> menuItems;

  @OneToMany(mappedBy = "restaurant")
  private List<Reviews> reviews;

  @OneToMany(mappedBy = "restaurant")
  private List<Order> orders;

  public Restaurant() {
  }

  public Restaurant(String name, String location, Owner owner) {
    this.name = name;
    this.location = location;
    this.owner = owner;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Owner getOwnerID() {
    return owner;
  }

  public void setOwnerID(Owner owner) {
    this.owner = owner;
  }

}
