/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabio.andriosi.wscliente;

import com.fabio.andriosi.webservice.Calculator;
import com.fabio.andriosi.webservice.CalculatorWSService;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author andriosi
 */
public class ClienteApp {
      
   public int getResult(int i, int j,String operation){ 
      Calculator port = new CalculatorWSService().getCalculatorPort();
      return port.add(i, j, operation);
   }
}
