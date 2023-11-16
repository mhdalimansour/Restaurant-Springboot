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
@Table(name = "orderitem")
public class OrderItem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "order_item_id")
  private int orderItem;

  @ManyToOne
  @JoinColumn(name = "item_id")
  private MenuItem menuItem;

  @ManyToOne
  @JoinColumn(name = "cart_id")
  private Cart cart;

  @Column(name = "quantity")
  private int quantity;

  public OrderItem() {
  }

  public OrderItem(MenuItem menuItem, int quantity, Cart cart) {
    this.menuItem = menuItem;
    this.quantity = quantity;
    this.cart = cart;
  }

  public int getOrderItem() {
    return orderItem;
  }

  public void setOrderItem(int orderItem) {
    this.orderItem = orderItem;
  }

  public MenuItem getItem() {
    return menuItem;
  }

  public void setItem(MenuItem menuItem) {
    this.menuItem = menuItem;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public Cart getCart() {
    return cart;
  }

  public void setCartId(Cart cart) {
    this.cart = cart;
  }

}
