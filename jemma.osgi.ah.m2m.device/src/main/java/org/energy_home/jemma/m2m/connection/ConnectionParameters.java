//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.25 at 11:13:34 AM CEST 
//


package org.energy_home.jemma.m2m.connection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Parameters sent by the M2M Core Platform to the M2M Device during the registration phase and 
 * the connection keepalive interactions. 
 *                     
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "token",
    "time",
    "timeOffset",
    "keepAliveTimeout",
    "nwkSclBaseId"
})
@XmlRootElement(name = "ConnectionParameters")
public class ConnectionParameters
    extends M2MConnectionXmlObject
{

    @XmlElement(name = "Id")
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "Time")
    protected long time;
    @XmlElement(name = "TimeOffset")
    protected int timeOffset;
    @XmlElement(name = "KeepAliveTimeout")
    protected long keepAliveTimeout;
    @XmlElement(name = "NwkSclBaseId")
    @XmlSchemaType(name = "anyURI")
    protected String nwkSclBaseId;

    /**
     * 
     * The id property is the relative URI of the SCL resource exposed by the M2M Core Platform and 
     * associated to the M2M Device (the base URI is specified by the nwkSclBaseId property). This 
     * property is not null only in registration successful responses.
     *                                 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 
     * The token property is used for authentication of all requests sent by the M2M Device after the 
     * registration phase. This property is not null only in registration successful responses. 
     *                                 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * 
     * The time property specifies the M2M Core Platform time as UTC milliseconds from the Epoch 
     * (January 1, 1970 00:00:00.000 GMT)  
     *                                 
     * 
     */
    public long getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     */
    public void setTime(long value) {
        this.time = value;
    }

    /**
     * 
     * The timeOffset property specifies the offset of M2M Core Platform time zone from UTC.  
     *                                 
     * 
     */
    public int getTimeOffset() {
        return timeOffset;
    }

    /**
     * Sets the value of the timeOffset property.
     * 
     */
    public void setTimeOffset(int value) {
        this.timeOffset = value;
    }

    /**
     * 
     * The keepAliveTimeout property specifies the keepalive timeout in milliseconds. This value 
     * is used to monitor the M2M Device connection. If this value is 0, no keepalive messages are 
     * sent by the M2M Device.  
     *                                 
     * 
     */
    public long getKeepAliveTimeout() {
        return keepAliveTimeout;
    }

    /**
     * Sets the value of the keepAliveTimeout property.
     * 
     */
    public void setKeepAliveTimeout(long value) {
        this.keepAliveTimeout = value;
    }

    /**
     * 
     * The nwkSclBaseId property specifies the M2M Core Platform Network SCL base resource URI. This 
     * property is not null only in registration successful responses. 
     *                                 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNwkSclBaseId() {
        return nwkSclBaseId;
    }

    /**
     * Sets the value of the nwkSclBaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNwkSclBaseId(String value) {
        this.nwkSclBaseId = value;
    }

}
