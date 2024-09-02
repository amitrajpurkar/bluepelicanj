/*
 * Copyright (c) DB Schenker Australia Pty Ltd
 *
 * All rights reserved.
 */
package bpj.lesson1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hamcrest.core.StringContains;
import org.hamcrest.core.StringStartsWith;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 * @author amitrajpurkar
 *
 */
@TestInstance(Lifecycle.PER_CLASS)
class Lesson1Tests {

    Lesson1 sut;

    /**
     * @throws java.lang.Exception
     */
    @BeforeAll
    void setUpBeforeClass() throws Exception {
        sut = new Lesson1();
    }

    /**
     * Test method for {@link bpj.lesson1.Lesson1#processStringInputs(java.lang.String[])}.
     */
    @Test
    void testProcessStringInputs_when_nothing_is_provided() {
        String output = sut.processStringInputs(null);
        assertEquals("Hello Work!", output);
    }

    @Test
    void testProcessStringInputs_for_multiline_textBlock() {
        String[] input = new String[] { "multiline string" };
        String output = sut.processStringInputs(input);
        assertThat(output, StringContains.containsStringIgnoringCase("jack jones"));
        assertThat(output, StringStartsWith.startsWithIgnoringCase("from: Bill smith"));
    }

}
