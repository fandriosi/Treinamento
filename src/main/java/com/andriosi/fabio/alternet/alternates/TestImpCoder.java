/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.alternet.alternates;
import javax.enterprise.inject.Alternative;
/**
 *
 * @author andriosi
 */
@Alternative
public class TestImpCoder implements Coder {

    @Override
    public String codeString(String s, int tval) {
        return ("input String is "+s+", shift values is "+tval);
    }
    
}
