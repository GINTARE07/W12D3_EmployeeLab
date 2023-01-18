import org.junit.Before;
import org.junit.Test;
import management.Manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jeff", 3, 12000, "HR");
    }

    @Test
    public void hasName(){
        assertEquals("Jeff", manager.getName());
    }
    @Test
    public void hasNiNumber(){
        assertEquals(3, manager.getNiNumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(12000, manager.getSalary());
    }
    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(13000, manager.getSalary(), 0.0);
    }
    @Test
    public void canPayBonus(){
        assertEquals(120, manager.payBonus(), 0.0);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("HR", manager.getDeptName());
    }
    @Test
    public void canChangeEmployeeName(){
       manager.changeName("Bob");
       assertEquals("Bob", manager.getName());
    }
    @Test
    public void preventChangeNameToNull(){
        manager.changeName(null);
        assertEquals("Jeff", manager.getName());
    }

}
