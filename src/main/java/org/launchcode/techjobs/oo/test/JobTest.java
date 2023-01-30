package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job analyst = new Job("Analyst", new Employer("FBI"),  new Location("Virginia") ,new PositionType("Intern"), new CoreCompetency("BS Analysis"));
        Job scientist = new Job("Scientist", new Employer("Space Force") ,new Location ("Idaho"), new PositionType("Junior Scientist"), new CoreCompetency("Aerospace certified"));
        assertNotEquals(analyst.getId(),scientist.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(productTester instanceof Job);
        assertTrue(productTester.getEmployer() instanceof Employer);
        assertTrue(productTester.getPositionType().getValue() instanceof String);
        assertTrue(productTester.getCoreCompetency().getValue() instanceof String);
        assertEquals("Product tester", productTester.getName());
        assertEquals("ACME", productTester.getEmployer().getValue());
        assertEquals("Desert", productTester.getLocation().getValue());
    }
    @Test
    public void testJobsForEquality()   {
            Job analyst = new Job("Scientist", new Employer("FBI"),  new Location("Virginia") ,new PositionType("Intern"), new CoreCompetency("Aerospace certified"));
            Job scientist = new Job("Scientist", new Employer("FBI") ,new Location ("Virginia"), new PositionType("Intern"), new CoreCompetency("Aerospace certified"));
            assertFalse(analyst.equals(scientist));
    }

}
