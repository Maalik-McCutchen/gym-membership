package com.pluralsight;

import java.math.BigDecimal;

public class BasicMembership extends Membership {

    private boolean offPeakOnly;

    public BasicMembership(String memberName, int months, BigDecimal baseRate, boolean offPeakOnly) {
        super(memberName, months, baseRate);
        this.offPeakOnly = offPeakOnly;
    }

    public boolean isOffPeakOnly() {
        return offPeakOnly;
    }

    public void setOffPeakOnly(boolean offPeakOnly) {
        this.offPeakOnly = offPeakOnly;
    }

    // Class 'BasicMembership' must either be declared abstract or implement abstract method 'getMonthlyPrice()' in 'Membership'

    @Override
    public BigDecimal getMonthlyPrice() {

        if (offPeakOnly) {
            BigDecimal price = getBaseRate().subtract(new BigDecimal("5.00"));

            return price;
        }
        return getBaseRate();
    }

    @Override
    public String toString() {
        return "Basic " + "| " + getMemberName() + " | " + getMonths() + " months" + " | off-peak only: " + offPeakOnly;
    }
}
