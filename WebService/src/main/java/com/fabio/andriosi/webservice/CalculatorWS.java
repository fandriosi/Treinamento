/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabio.andriosi.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author andriosi
 */

@WebService(name="Calculator")
public class CalculatorWS {
   @WebMethod(operationName="Add")
   public int add(@WebParam(name="i")int i, @WebParam(name="j") int j, @WebParam(name="op") String operator) {
      int result= -1;
      operator = operator.toUpperCase();
      try{
         if(operator.equals("SUB"))
            result = i - j;
         if(operator.equals("DIV"))
            result = i / j;
         if(operator.equals("SUM"))
            result = i + j;
         if(operator.equals("MTP"))
            result = i * j;
      }catch(ArithmeticException ex){
         System.out.print(ex.toString());
      }
      
      return result;
   }
}
