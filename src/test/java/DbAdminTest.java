import org.junit.Before;
import org.junit.Test;
import techStaff.DbAdmin;

import static org.junit.Assert.assertEquals;

public class DbAdminTest {
    DbAdmin dbAdmin;

    @Before
    public void before(){
        dbAdmin = new DbAdmin("Jeff", 3, 12000);
    }

    @Test
    public void hasName(){
        assertEquals("Jeff", dbAdmin.getName());
    }
    @Test
    public void hasNiNumber(){
        assertEquals(3, dbAdmin.getNiNumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(12000, dbAdmin.getSalary());
    }
    @Test
    public void canRaiseSalary(){
        dbAdmin.raiseSalary(1000);
        assertEquals(13000, dbAdmin.getSalary(), 0.0);
    }
    @Test
    public void canPayBonus(){
        assertEquals(120, dbAdmin.payBonus(), 0.0);
    }
}