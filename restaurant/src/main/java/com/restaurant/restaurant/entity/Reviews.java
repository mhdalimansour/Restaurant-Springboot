package com.restaurant.restaurant.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviews")
public class Reviews {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "review_id")
  private int reviewId;

  @ManyToOne
  @JoinColumn(name = "customer_id")
  private Customer customer;

  @ManyToOne
  @JoinColumn(name = "restaurant_id")
  private Restaurant restaurant;

  @Column(name = "rating")
  private double rating;

  @Column(name = "review_text")
  private String reviewText;

  @Column(name = "review_date")
  private String reviewDate;

  public Reviews() {
  }

  public Reviews(Customer customer, Restaurant restaurant, double rating, String reviewText, String reviewDate) {
    this.customer = customer;
    this.restaurant = restaurant;
    this.rating = rating;
    this.reviewText = reviewText;
    this.reviewDate = reviewDate;
  }

  public int getReviewId() {
    return reviewId;
  }

  public void setReviewId(int reviewId) {
    this.reviewId = reviewId;
  }

  public Customer getCustomerId() {
    return customer;
  }

  public void setCustomerId(Customer customer) {
    this.customer = customer;
  }

  public Restaurant getRestaurantId() {
    return restaurant;
  }

  public void setRestaurantId(Restaurant restaurant) {
    this.restaurant = restaurant;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public String getReviewText() {
    return reviewText;
  }

  public void setReviewText(String reviewText) {
    this.reviewText = reviewText;
  }

  public String getReviewDate() {
    return reviewDate;
  }

  public void setReviewDate(String reviewDate) {
    this.reviewDate = reviewDate;
  }
}
