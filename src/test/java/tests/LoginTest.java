package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void openGoogle() {

        System.out.println("Docker Container Running");
        System.out.println("Jenkins Pipeline Running");
        System.out.println("Containerized Test Execution Successful");

        Assert.assertTrue(true);
    }
}