//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 04:25:40 PM CST 
//


package cdxml.dom;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}t" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="TagType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="Unknown"/&gt;
 *             &lt;enumeration value="String"/&gt;
 *             &lt;enumeration value="Long"/&gt;
 *             &lt;enumeration value="Double"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Tracking" default="yes"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="yes"/&gt;
 *             &lt;enumeration value="no"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Persistent" default="yes"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="yes"/&gt;
 *             &lt;enumeration value="no"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="PositioningType" default="auto"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="auto"/&gt;
 *             &lt;enumeration value="angle"/&gt;
 *             &lt;enumeration value="offset"/&gt;
 *             &lt;enumeration value="absolute"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="PositioningAngle" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="PositioningOffset" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "t"
})
@XmlRootElement(name = "objecttag")
public class Objecttag {

    protected List<T> t;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "TagType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tagType;
    @XmlAttribute(name = "Name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "DisplayName")
    @XmlSchemaType(name = "anySimpleType")
    protected String displayName;
    @XmlAttribute(name = "Tracking")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tracking;
    @XmlAttribute(name = "Persistent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String persistent;
    @XmlAttribute(name = "Value")
    @XmlSchemaType(name = "anySimpleType")
    protected String value;
    @XmlAttribute(name = "PositioningType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String positioningType;
    @XmlAttribute(name = "PositioningAngle")
    @XmlSchemaType(name = "anySimpleType")
    protected String positioningAngle;
    @XmlAttribute(name = "PositioningOffset")
    @XmlSchemaType(name = "anySimpleType")
    protected String positioningOffset;

    /**
     * Gets the value of the t property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the t property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link T }
     * 
     * 
     */
    public List<T> getT() {
        if (t == null) {
            t = new ArrayList<T>();
        }
        return this.t;
    }

    /**
     * Gets the value of the id property.
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
     * Gets the value of the tagType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagType() {
        return tagType;
    }

    /**
     * Sets the value of the tagType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagType(String value) {
        this.tagType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the tracking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTracking() {
        if (tracking == null) {
            return "yes";
        } else {
            return tracking;
        }
    }

    /**
     * Sets the value of the tracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTracking(String value) {
        this.tracking = value;
    }

    /**
     * Gets the value of the persistent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistent() {
        if (persistent == null) {
            return "yes";
        } else {
            return persistent;
        }
    }

    /**
     * Sets the value of the persistent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistent(String value) {
        this.persistent = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the positioningType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositioningType() {
        if (positioningType == null) {
            return "auto";
        } else {
            return positioningType;
        }
    }

    /**
     * Sets the value of the positioningType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositioningType(String value) {
        this.positioningType = value;
    }

    /**
     * Gets the value of the positioningAngle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositioningAngle() {
        return positioningAngle;
    }

    /**
     * Sets the value of the positioningAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositioningAngle(String value) {
        this.positioningAngle = value;
    }

    /**
     * Gets the value of the positioningOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositioningOffset() {
        return positioningOffset;
    }

    /**
     * Sets the value of the positioningOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositioningOffset(String value) {
        this.positioningOffset = value;
    }

}
