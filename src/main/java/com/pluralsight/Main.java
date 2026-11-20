package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Membership henryClark = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        BasicMembership aliceJohnson = new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true);
        BasicMembership bobSmith = new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"), false);

        System.out.println("=== Gym Memberships ===");
        System.out.println(henryClark.getMemberName() + ", " + henryClark.getMonths() + " months, $" + henryClark.getMonthlyPrice() + " per month");
        System.out.println(aliceJohnson.getMemberName() + ", " + aliceJohnson.getMonths() + " months, $" + aliceJohnson.getMonthlyPrice() + " per month");
        System.out.println(bobSmith.getMemberName() + ", " + bobSmith.getMonths() + " months, $" + bobSmith.getMonthlyPrice() + " per month");

    }
}