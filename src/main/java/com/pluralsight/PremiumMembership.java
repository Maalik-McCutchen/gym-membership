package com.pluralsight;

import java.math.BigDecimal;

public class PremiumMembership extends Membership {

    private int guestPasses;

    public PremiumMembership(String memberName, int months, BigDecimal baseRate, int guestPasses) {
        super(memberName, months, baseRate);
        this.guestPasses = guestPasses;
    }

    public int getGuestPasses() {
        return guestPasses;
    }

    public void setGuestPasses(int guestPasses) {
        this.guestPasses = guestPasses;
    }

    @Override
    public BigDecimal getMonthlyPrice() {

        BigDecimal price = getBaseRate().add(new BigDecimal("18.50"));

        return price;
    }

    public void useGuestPass() {
        if (guestPasses > 0) {
            guestPasses--;
            System.out.println(getMemberName() + " used a guest pass. Passes left: " + guestPasses);

        } else {
            System.out.println(getMemberName() + " has no guest passes left.");
        }
    }
}
