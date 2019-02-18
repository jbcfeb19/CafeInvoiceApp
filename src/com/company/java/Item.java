package com.company.java;

public class Item {

private String name;
private double price;
private int quantity;
private boolean isTaxable;

  public Item() {
  }

  public Item(String name, double price, int quantity, boolean isTaxable) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.isTaxable = isTaxable;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public boolean isTaxable() {
    return isTaxable;
  }

  public void setTaxable(boolean taxable) {
    isTaxable = taxable;
  }


  // This method returns the tax rate according to the state
  public double getTax(String state){
    double tax = 0;
    if(state.equalsIgnoreCase("md")){
      tax=  .06;
    }else if(state.equalsIgnoreCase("dc")){
      tax= .0530;
    }else if(state.equalsIgnoreCase("va")){
      tax= .0575;
    }else if(state.equalsIgnoreCase("other")){
      tax= .050;
    }
    return tax;
  }

  // Returns the cost
  public double getCost(){
    return price * quantity;
  }

}
