/*
 * Copyright (c) DB Schenker Australia Pty Ltd
 *
 * All rights reserved.
 */
package bpj.lesson7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 * @author amitrajpurkar
 *
 */
@TestInstance(Lifecycle.PER_CLASS)
class Lesson7Tests {

    Lesson7 sut;

    /**
     * @throws java.lang.Exception
     */
    @BeforeAll
    void setUpBeforeClass() throws Exception {
        sut = new Lesson7();
    }

    /**
     * Test method for {@link bpj.lesson7.Lesson7#processStringInputs(java.lang.String[])}.
     */
    // @Test
    void testProcessStringInputs() {
        String expectedLine = "hello one two three";

        // enter exactly like "expectedLine" when prompted, else the test will fail
        String output = sut.processStringInputs(null);
        assertEquals(expectedLine, output);
    }

    // @Test
    void test_radius_of_circle() {
        String expectedRadius = "Radius of your circle is 4"; // when area is 50.24
        String[] input = new String[] { "Going in Circles" };

        String output = sut.processStringInputs(input);
        assertEquals(expectedRadius, output);
    }

    @Test
    void test_full_name_project() {
        String expectedResult = "Your full name is John Doe"; // enter firstname=John and
                                                              // Lastname=Doe
        String[] input = new String[] { "Whats my Name" };

        String output = sut.processStringInputs(input);
        assertEquals(expectedResult, output);
    }

}
