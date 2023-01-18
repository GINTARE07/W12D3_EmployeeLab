import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DevTest {
        Developer developer;

        @Before
        public void before(){
            developer = new Developer("Jeff", 3, 12000);
        }

        @Test
        public void hasName(){
            assertEquals("Jeff", developer.getName());
        }
        @Test
        public void hasNiNumber(){
            assertEquals(3, developer.getNiNumber());
        }
        @Test
        public void hasSalary(){
            assertEquals(12000, developer.getSalary());
        }
        @Test
        public void canRaiseSalary(){
            developer.raiseSalary(1000);
            assertEquals(13000, developer.getSalary(), 0.0);
        }
        @Test
        public void cannotReduceSalary(){
            developer.raiseSalary(-1000);
            assertEquals(12000, developer.getSalary(), 0.0);
        }

        @Test
        public void canPayBonus(){
            assertEquals(120, developer.payBonus(), 0.0);
        }
    }

