package com.pluralsight;

import java.math.BigDecimal;

public class FamilyMembership extends Membership {

    private int extraMembers;

    public FamilyMembership(String memberName, int months, BigDecimal baseRate, int extraMembers) {
        super(memberName, months, baseRate);
        this.extraMembers = extraMembers;
    }

    public int getExtraMembers() {
        return extraMembers;
    }

    public void setExtraMembers(int extraMembers) {
        this.extraMembers = extraMembers;
    }

    @Override
    public BigDecimal getMonthlyPrice() {

        if (extraMembers > 0) {

            BigDecimal price = new BigDecimal("12.50").multiply(BigDecimal.valueOf(extraMembers));

            price = price.add(getBaseRate());

            if (extraMembers >= 3) {
                BigDecimal discount = price.divide(new BigDecimal("10"));
                price = price.subtract(discount);
            }
            return price;
        }
        return getBaseRate();
    }

    @Override
    public String toString() {
        return "Family " + "| " + getMemberName() + " | " + getMonths() + " months" + " | " + "extra members: " + extraMembers;
    }
}
