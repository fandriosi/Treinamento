package com.fabio.andriosi.webservice.teste;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.fabio.andriosi.webservice.CalculatorWS;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andriosi
 */
public class TestWebCalculator {
   
    /**
    * Test of add method, of class CalculatorWS.
    */
   
   @Test
   public void testSubtracao() {
      System.out.println("add");
      int i = 10;
      int j = 0;
      String operator ="Sub";
      CalculatorWS instance = new CalculatorWS();
      int expResult = 10;
      int result = instance.add(i, j, operator);
      assertEquals(expResult, result);
      
      // TODO review the generated test code and remove the default call to fail.
      //fail("The test case is a prototype.");
   }
   
   @Test
   public void testMultiplicacao() {
      System.out.println("add");
      int i = 10;
      int j = 2;
      String operator ="Mtp";
      CalculatorWS instance = new CalculatorWS();
      int expResult = 20;
      int result = instance.add(i, j, operator);
      assertEquals(expResult, result);
      
      // TODO review the generated test code and remove the default call to fail.
      //fail("The test case is a prototype.");
   }@Test
   public void testAdd() {
      System.out.println("add");
      int i = 10;
      int j = 5;
      String operator ="sum";
      CalculatorWS instance = new CalculatorWS();
      int expResult = 15;
      int result = instance.add(i, j, operator);
      assertEquals(expResult, result);
      
      // TODO review the generated test code and remove the default call to fail.
      //fail("The test case is a prototype.");
   }@Test
   public void testDivisao() {
      System.out.println("add");
      int i = 10;
      int j = 2;
      String operator ="Div";
      CalculatorWS instance = new CalculatorWS();
      int expResult = 5;
      int result = instance.add(i, j, operator);
      assertEquals(expResult, result);
      
      // TODO review the generated test code and remove the default call to fail.
      //fail("The test case is a prototype.");
   }
}
