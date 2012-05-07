//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.07 at 09:09:56 PM CEST 
//


package org.comtel.javafx.xml.layout;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Row" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="codes" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="keyLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="keyIconStyle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="keyWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="keyEdgeFlags">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="left"/>
 *                                 &lt;enumeration value="right"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="horizontalGap" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="rowEdgeFlags">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="top"/>
 *                       &lt;enumeration value="bottom"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="keyWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="keyHeight" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="horizontalGap" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="verticalGap" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "row"
})
@XmlRootElement(name = "Keyboard")
public class Keyboard {

    @XmlElement(name = "Row", required = true)
    protected List<Keyboard.Row> row;
    @XmlAttribute(name = "keyWidth")
    protected Integer keyWidth;
    @XmlAttribute(name = "keyHeight")
    protected Integer keyHeight;
    @XmlAttribute(name = "horizontalGap")
    protected Integer horizontalGap;
    @XmlAttribute(name = "verticalGap")
    protected Integer verticalGap;

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Keyboard.Row }
     * 
     * 
     */
    public List<Keyboard.Row> getRow() {
        if (row == null) {
            row = new ArrayList<Keyboard.Row>();
        }
        return this.row;
    }

    /**
     * Gets the value of the keyWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKeyWidth() {
        return keyWidth;
    }

    /**
     * Sets the value of the keyWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKeyWidth(Integer value) {
        this.keyWidth = value;
    }

    /**
     * Gets the value of the keyHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKeyHeight() {
        return keyHeight;
    }

    /**
     * Sets the value of the keyHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKeyHeight(Integer value) {
        this.keyHeight = value;
    }

    /**
     * Gets the value of the horizontalGap property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHorizontalGap() {
        return horizontalGap;
    }

    /**
     * Sets the value of the horizontalGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHorizontalGap(Integer value) {
        this.horizontalGap = value;
    }

    /**
     * Gets the value of the verticalGap property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVerticalGap() {
        return verticalGap;
    }

    /**
     * Sets the value of the verticalGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVerticalGap(Integer value) {
        this.verticalGap = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Key" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="codes" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="keyLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="keyIconStyle" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="keyWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="keyEdgeFlags">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="left"/>
     *                       &lt;enumeration value="right"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="horizontalGap" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="rowEdgeFlags">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="top"/>
     *             &lt;enumeration value="bottom"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key"
    })
    public static class Row {

        @XmlElement(name = "Key", required = true)
        protected List<Keyboard.Row.Key> key;
        @XmlAttribute(name = "rowEdgeFlags")
        protected String rowEdgeFlags;

        /**
         * Gets the value of the key property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the key property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKey().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Keyboard.Row.Key }
         * 
         * 
         */
        public List<Keyboard.Row.Key> getKey() {
            if (key == null) {
                key = new ArrayList<Keyboard.Row.Key>();
            }
            return this.key;
        }

        /**
         * Gets the value of the rowEdgeFlags property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRowEdgeFlags() {
            return rowEdgeFlags;
        }

        /**
         * Sets the value of the rowEdgeFlags property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRowEdgeFlags(String value) {
            this.rowEdgeFlags = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="codes" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="keyLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="keyIconStyle" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="keyWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="keyEdgeFlags">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="left"/>
         *             &lt;enumeration value="right"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="horizontalGap" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Key {

            @XmlAttribute(name = "codes", required = true)
            protected String codes;
            @XmlAttribute(name = "keyLabel")
            protected String keyLabel;
            @XmlAttribute(name = "keyIconStyle")
            protected String keyIconStyle;
            @XmlAttribute(name = "keyWidth")
            protected Integer keyWidth;
            @XmlAttribute(name = "keyEdgeFlags")
            protected String keyEdgeFlags;
            @XmlAttribute(name = "horizontalGap")
            protected Integer horizontalGap;

            /**
             * Gets the value of the codes property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodes() {
                return codes;
            }

            /**
             * Sets the value of the codes property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodes(String value) {
                this.codes = value;
            }

            /**
             * Gets the value of the keyLabel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKeyLabel() {
                return keyLabel;
            }

            /**
             * Sets the value of the keyLabel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKeyLabel(String value) {
                this.keyLabel = value;
            }

            /**
             * Gets the value of the keyIconStyle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKeyIconStyle() {
                return keyIconStyle;
            }

            /**
             * Sets the value of the keyIconStyle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKeyIconStyle(String value) {
                this.keyIconStyle = value;
            }

            /**
             * Gets the value of the keyWidth property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getKeyWidth() {
                return keyWidth;
            }

            /**
             * Sets the value of the keyWidth property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setKeyWidth(Integer value) {
                this.keyWidth = value;
            }

            /**
             * Gets the value of the keyEdgeFlags property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKeyEdgeFlags() {
                return keyEdgeFlags;
            }

            /**
             * Sets the value of the keyEdgeFlags property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKeyEdgeFlags(String value) {
                this.keyEdgeFlags = value;
            }

            /**
             * Gets the value of the horizontalGap property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getHorizontalGap() {
                return horizontalGap;
            }

            /**
             * Sets the value of the horizontalGap property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setHorizontalGap(Integer value) {
                this.horizontalGap = value;
            }

        }

    }

}
