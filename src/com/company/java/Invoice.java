package com.company.java;

public class Invoice {
  private String customerName;
  private String date;
  private String address;
  private String accountNumber;

  public Invoice() {
  }

  public Invoice(String customerName, String date, String address, String accountNumber) {
    this.customerName = customerName;
    this.date = date;
    this.address = address;
    this.accountNumber = accountNumber;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }
}
