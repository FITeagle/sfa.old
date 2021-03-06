//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 10:17:53 AM CEST 
//


package org.fiteagle.sfa.rspec.advertisement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for RSpecContents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSpecContents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;group ref="{http://www.geni.net/resources/rspec/3}AnyExtension"/>
 *           &lt;element ref="{http://www.geni.net/resources/rspec/3}node"/>
 *           &lt;element ref="{http://www.geni.net/resources/rspec/3}link"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.geni.net/resources/rspec/3}external_ref"/>
 *           &lt;element ref="{http://www.geni.net/resources/rspec/3}type_relation"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.geni.net/resources/rspec/3}AnyExtension"/>
 *       &lt;attribute name="generated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="generated_by" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="expires" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="advertisement"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSpecContents", propOrder = {
    "anyOrNodeOrLink"
})
public class RSpecContents {

    @XmlElementRefs({
        @XmlElementRef(name = "type_relation", namespace = "http://www.geni.net/resources/rspec/3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "link", namespace = "http://www.geni.net/resources/rspec/3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "node", namespace = "http://www.geni.net/resources/rspec/3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "external_ref", namespace = "http://www.geni.net/resources/rspec/3", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> anyOrNodeOrLink;
    @XmlAttribute(name = "generated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generated;
    @XmlAttribute(name = "generated_by")
    @XmlSchemaType(name = "anySimpleType")
    protected String generatedBy;
    @XmlAttribute(name = "expires")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expires;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the anyOrNodeOrLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anyOrNodeOrLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnyOrNodeOrLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link NodeContents }{@code >}
     * {@link JAXBElement }{@code <}{@link ExternalReferenceContents }{@code >}
     * {@link Element }
     * {@link JAXBElement }{@code <}{@link TypeRelationContents }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkContents }{@code >}
     * 
     * 
     */
    public List<Object> getAnyOrNodeOrLink() {
        if (anyOrNodeOrLink == null) {
            anyOrNodeOrLink = new ArrayList<Object>();
        }
        return this.anyOrNodeOrLink;
    }

    /**
     * Gets the value of the generated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGenerated() {
        return generated;
    }

    /**
     * Sets the value of the generated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGenerated(XMLGregorianCalendar value) {
        this.generated = value;
    }

    /**
     * Gets the value of the generatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneratedBy() {
        return generatedBy;
    }

    /**
     * Sets the value of the generatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneratedBy(String value) {
        this.generatedBy = value;
    }

    /**
     * Gets the value of the expires property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpires() {
        return expires;
    }

    /**
     * Sets the value of the expires property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpires(XMLGregorianCalendar value) {
        this.expires = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
