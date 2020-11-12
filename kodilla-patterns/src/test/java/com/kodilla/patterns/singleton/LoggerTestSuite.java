

package com.kodilla.patterns.singleton;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLogTest(){
        //Given
        String logFirst = "First log";
        String logSecond = "Second log";
        String logThird = "Third log";
        //When
        Logger.getInstance().log(logFirst);
        Logger.getInstance().log(logSecond);
        Logger.getInstance().log(logThird);
        //Then
        Assert.assertEquals(logSecond, Logger.getInstance().getLastLog());
    }
}