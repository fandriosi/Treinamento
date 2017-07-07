/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabio.andriosi.wscliente;
import com.fabio.andriosi.webservice.Calculator;
import com.fabio.andriosi.webservice.CalculatorWSService;
/**
 *
 * @author andriosi
 */
public class TestCliente {
   public static void main(String []args){
      ClienteApp app = new ClienteApp();
      int i=9;
      int j=0;
      System.out.println("Result: "+ app.getResult(i,j,"Div"));
   }
}
