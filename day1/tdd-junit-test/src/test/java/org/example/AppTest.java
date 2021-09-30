package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Hello hello = new Hello();
        String result = hello.say("somkiat");
        Assertions.assertEquals( "Hello somkiat", result);
    }
}
