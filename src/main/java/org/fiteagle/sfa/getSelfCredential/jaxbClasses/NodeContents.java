//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.03 at 03:55:56 PM CEST 
//


package org.fiteagle.sfa.getSelfCredential.jaxbClasses;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NodeContents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeContents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{}NodeTypeList"/>
 *         &lt;element ref="{}interface"/>
 *       &lt;/choice>
 *       &lt;attribute name="virtualization_type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="raw"/>
 *             &lt;enumeration value="trellis-vserver"/>
 *             &lt;enumeration value="planetlab-vserver"/>
 *             &lt;enumeration value="emulab-vnode"/>
 *             &lt;enumeration value="bgpmux"/>
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
@XmlType(name = "NodeContents", propOrder = {
    "nodeTypeOrInterface"
})
public class NodeContents {

    @XmlElements({
        @XmlElement(name = "node_type", type = NodeType.class),
        @XmlElement(name = "interface", type = Interface.class)
    })
    protected List<Object> nodeTypeOrInterface;
    @XmlAttribute(name = "virtualization_type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String virtualizationType;

    /**
     * Gets the value of the nodeTypeOrInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeTypeOrInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeTypeOrInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeType }
     * {@link Interface }
     * 
     * 
     */
    public List<Object> getNodeTypeOrInterface() {
        if (nodeTypeOrInterface == null) {
            nodeTypeOrInterface = new ArrayList<Object>();
        }
        return this.nodeTypeOrInterface;
    }

    /**
     * Gets the value of the virtualizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualizationType() {
        return virtualizationType;
    }

    /**
     * Sets the value of the virtualizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualizationType(String value) {
        this.virtualizationType = value;
    }

}
