package com.maven.testNGMaven;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestNgMavenExampleTest {
 
    @Test
    public void exampleOfTestNgMaven() {
        System.out.println("This is TestNG-Maven Example");
    }
    
    @Test
    public void testAdd() {
       String str = "TestNG is working fine";
       assertEquals("TestNG is working fine", str);
    }
}