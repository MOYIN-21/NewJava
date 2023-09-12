package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Employee.CommissionEmployee;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommissionEmployeeTest {
    CommissionEmployee employee;

    @BeforeEach
    void setUp() {
        employee = new CommissionEmployee("kim","Precious","345678",10000.0,0.10);
    }

    @Test
    public void employeeCanGetEmployeeFirstName(){
        employee.getFirstName("kim");
        assertEquals("kim","kim");
    }

    @Test
    public void employeeCanGetLastName(){
        employee.getLastName("Precious");
        assertEquals("precious","precious");
    }

    @Test
    public void employeeCanGetSecurityNumber(){
        employee.SocialSecurityNumber("345678");
        assertEquals("345678","345678");
    }

    @Test
    public void employeeCanGetGrossSales(){
        employee.grossSales(10000.0);
        assertEquals(10000.0,10000.0);
    }

    @Test
    public void employeeCanGetCommissionRate(){
        employee.commissionRate(0.10);
        double rate = employee.setCommissionRate(0.10);
        assertEquals(0.10,rate);
    }

    @Test
    public void setEmployeeCanEarning(){
        employee.commissionRate(100);
        employee.grossSales(10);
        employee.earning(1000);
        assertEquals(1000,employee.earning(1000));
    }
}
