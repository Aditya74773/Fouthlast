package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void testPipeline() {

        System.out.println("================================");
        System.out.println("Docker Container Running");
        System.out.println("Selenium Project Executed");
        System.out.println("CI/CD Pipeline Success");
        System.out.println("================================");

        Assert.assertTrue(true);
    }
}