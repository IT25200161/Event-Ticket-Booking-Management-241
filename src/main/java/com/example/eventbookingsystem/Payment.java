package com.example.eventbookingsystem;

public class Payment {

    private int paymentId;
    private double amount;
    private String status;
    private String method;


    public Payment(int paymentId, double amount, String status, String method) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = status;
        this.method = method;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public String getMethod() {
        return method;
    }

    // Setters
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMethod(String method) {
        this.method = method;
    }


    public void processPayment() {
        System.out.println("Processing General Payment...");
    }

    // Display Payment
    public void displayPayment() {

        System.out.println("--------------------------------");
        System.out.println("Payment ID : " + paymentId);
        System.out.println("Amount     : " + amount);
        System.out.println("Status     : " + status);
        System.out.println("Method     : " + method);
    }
}
