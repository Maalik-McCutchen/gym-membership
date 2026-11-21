package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Membership henryClark = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        BasicMembership aliceJohnson = new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true);
        BasicMembership bobSmith = new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"), false);
        PremiumMembership carolWhite = new PremiumMembership("Carol White", 12, new BigDecimal("30.00"), 2);
        PremiumMembership frankMiller = new PremiumMembership("Frank Miller", 3, new BigDecimal("30.00"), 0);
        FamilyMembership graceLee = new FamilyMembership("Grace Lee", 12, new BigDecimal("30.00"), 3 );
        FamilyMembership emmaWilson = new FamilyMembership("Emma Wilson", 6, new BigDecimal("30.00"), 1 );

        System.out.println();
        System.out.println("=== Gym Memberships ===");
        System.out.println(henryClark.getMemberName() + ", " + henryClark.getMonths() + " months, $" + henryClark.getMonthlyPrice() + " per month");
        System.out.println(aliceJohnson.getMemberName() + ", " + aliceJohnson.getMonths() + " months, $" + aliceJohnson.getMonthlyPrice() + " per month");
        System.out.println(bobSmith.getMemberName() + ", " + bobSmith.getMonths() + " months, $" + bobSmith.getMonthlyPrice() + " per month");
        System.out.println(carolWhite.getMemberName() + ", " + carolWhite.getMonths() + " months, $" + carolWhite.getMonthlyPrice() + " per month");
        System.out.println(frankMiller.getMemberName() + ", " + frankMiller.getMonths() + " months, $" + frankMiller.getMonthlyPrice() + " per month");
        System.out.println(graceLee.getMemberName() + ", " + graceLee.getMonths() + " months, $" + graceLee.getMonthlyPrice() + " per month");
        System.out.println(emmaWilson.getMemberName() + ", " + emmaWilson.getMonths() + " months, $" + emmaWilson.getMonthlyPrice() + " per month");

        System.out.println();
        System.out.println("--- Guest passes ---");
        carolWhite.useGuestPass();
        carolWhite.useGuestPass();
        carolWhite.useGuestPass();
        frankMiller.useGuestPass();

    }
}