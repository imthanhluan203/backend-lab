package lab.m01.w01.d02;

import lab.m01.w01.d02.Good.CompanyPolicy;
import lab.m01.w01.d02.Good.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompanyPolicyTest {

    @Test
    public void testEmployee(){
        Employee e = new Employee("Luan", 10, CompanyPolicy.NHAN_VIEN);
        assertEquals(1, e.bonus());
    }

    @Test
    public void testQuanLy(){
        Employee e = new Employee("Luan", 10, CompanyPolicy.QUAN_LY);
        assertEquals(6, e.bonus());
    }

    @Test
    public void testGiamDoc(){
        Employee e = new Employee("Luan", 10, CompanyPolicy.GIAM_DOC);
        assertEquals(9, e.bonus());
    }

    @Test
    public void testContractor(){
        Employee e = new Employee("Luan", 10, CompanyPolicy.Contractor);
        assertEquals(0.3, e.bonus());
    }
}
