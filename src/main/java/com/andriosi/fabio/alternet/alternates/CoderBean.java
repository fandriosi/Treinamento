/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andriosi.fabio.alternet.alternates;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author andriosi
 */
@Named
@RequestScoped
public class CoderBean {
    private String inputString;
    private String codeString;

    @Max(26)
    @Min(0)
    @NotNull
    private int transVal;
    @Inject
    Coder coder;

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public String getCodeString() {
        return codeString;
    }

    public void setCodeString(String codeString) {
        this.codeString = codeString;
    }

    public int getTransVal() {
        return transVal;
    }

    public void setTransVal(int transVal) {
        this.transVal = transVal;
    }
    public void encodeString(){
        setCodeString(coder.codeString(inputString, transVal));
    }
    public void reset(){
        setInputString("");
        setTransVal(0);
    }
}