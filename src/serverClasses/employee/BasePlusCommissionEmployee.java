package serverClasses.employee;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    }
}
