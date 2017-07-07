
package com.fabio.andriosi.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Add complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Add">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="i" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="j" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Add", propOrder = {
    "i",
    "j",
    "op"
})
public class Add {

    protected int i;
    protected int j;
    protected String op;

    /**
     * Gets the value of the i property.
     * 
     */
    public int getI() {
        return i;
    }

    /**
     * Sets the value of the i property.
     * 
     */
    public void setI(int value) {
        this.i = value;
    }

    /**
     * Gets the value of the j property.
     * 
     */
    public int getJ() {
        return j;
    }

    /**
     * Sets the value of the j property.
     * 
     */
    public void setJ(int value) {
        this.j = value;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOp() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOp(String value) {
        this.op = value;
    }

}
