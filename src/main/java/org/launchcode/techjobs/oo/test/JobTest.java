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
        assertTrue(productTester.getEmployer().getValue() instanceof String);
        assertTrue(productTester.getPositionType().getValue() instanceof String);
        assertTrue(productTester.getCoreCompetency().getValue() instanceof String);
        assertEquals("Product tester", productTester.getName());
        assertEquals("ACME", productTester.getEmployer().getValue());
        assertEquals("Desert", productTester.getLocation().getValue());
        assertEquals("Quality control", productTester.getPositionType().getValue());
        assertEquals("Persistence", productTester.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality()   {
            Job analyst = new Job("Scientist", new Employer("FBI"),  new Location("Virginia") ,new PositionType("Intern"), new CoreCompetency("Aerospace certified"));
            Job scientist = new Job("Scientist", new Employer("FBI") ,new Location ("Virginia"), new PositionType("Intern"), new CoreCompetency("Aerospace certified"));
            assertFalse(analyst.equals(scientist));
    }

    //When passed a Job object, it should return a string that contains a blank line before and after
    // the job information.

//    @Test
//    public void testToStringStartsAndEndsWithNewLine() {
//
//    }

    // The string should contain a label for each field, followed by the data
    // stored in that field. Each field should be on its own line.

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        assertEquals(toString(),toString());
    }

    //If a field is empty, the method should add, “Data not available” after the label.
//    @Test
//    public void testToStringHandlesEmptyField() {
//
//    }
//
//
    //(Bonus) If a Job object ONLY contains data for the id field, the method should return,
    // “OOPS! This job does not seem to exist.”
}
