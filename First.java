package com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class First {
  @Test
  public void f() {
	  System.out.println("f");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }

}
	