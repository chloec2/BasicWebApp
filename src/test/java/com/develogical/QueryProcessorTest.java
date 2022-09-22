package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsTeamName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("hi"));
    }

    @Test
    public void knowsChair() throws Exception {
        assertThat(queryProcessor.process("I like this chair"), containsString("a thing to sit on"));
    }

    @Test
    public void knows9plus12() throws Exception {
        assertThat(queryProcessor.process("what is 9 plus 12"), containsString("21"));
    }
    
    @Test
    public void knows208() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 208, 59, 147, 27"), containsString("208"));
    }

    @Test
    public void knows644() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 753, 82, 65, 644"), containsString("644"));
    }

    @Test
    public void knows15() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 15, 5"), containsString("15"));
    }

}
