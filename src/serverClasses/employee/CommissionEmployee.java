package serverClasses.employee;

import java.util.Objects;

public class CommissionEmployee extends Object{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public void getFirstName(String firstName) {
        if (!Objects.equals(firstName, firstName)) {
            throw new IllegalArgumentException("FIRSTNAME NOT FOUND");
        }
    }

    public void getLastName(String lastName) {
        if (lastName != lastName) {
            throw new IllegalArgumentException("LASTNAME NOT FOUND");
        }
    }

    public void SocialSecurityNumber(String socialSecurityNumber) {
        if (!Objects.equals(socialSecurityNumber, socialSecurityNumber)) {
            throw new IllegalArgumentException("INVALID SOCIAL SECURITY NUMBER");
        }
    }

    public void grossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("GROSS SALES MUST BE GREATER THAN 0.0");
        }
    }

    public void commissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate <= 1.0) {
            throw new IllegalArgumentException("COMMISSION RATE NOT ACCEPTED");
        }
    }


    public double setCommissionRate(double commissionRate) {
        if (commissionRate == commissionRate) {
            this.commissionRate = commissionRate;
        }
        return commissionRate;
    }

    public double earning(double earning){
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", commissionRate=" + commissionRate +
                ", grossSales=" + grossSales +
                '}';
    }
}
