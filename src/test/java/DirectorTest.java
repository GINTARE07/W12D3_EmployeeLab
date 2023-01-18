import org.junit.Before;
import org.junit.Test;
import management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Jeff", 3, 12000, "Management", 50000);
    }

    @Test
    public void hasName(){
        assertEquals("Jeff", director.getName());
    }
    @Test
    public void hasNiNumber(){
        assertEquals(3, director.getNiNumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(12000, director.getSalary());
    }
    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000);
        assertEquals(13000, director.getSalary(), 0.0);
    }
    @Test
    public void canPayBonus(){
        assertEquals(240, director.payBonus(), 0.0);
    }

    @Test
    public void hasBudget(){
        assertEquals(50000, director.getBudget(), 0.0);
    }
}
