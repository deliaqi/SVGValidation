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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{}objecttag"/&gt;
 *         &lt;element ref="{}t"/&gt;
 *         &lt;element ref="{}fragment"/&gt;
 *         &lt;element ref="{}group"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="SupersededBy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="bgcolor" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="p" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Z" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="BoundingBox" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="TextFrame" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="GroupFrame" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Valence" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="IgnoreWarnings" default="no"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="yes"/&gt;
 *             &lt;enumeration value="no"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Warning" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Visible" default="yes"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="yes"/&gt;
 *             &lt;enumeration value="no"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objecttagOrTOrFragment"
})
@XmlRootElement(name = "altgroup")
public class Altgroup {

    @XmlElements({
        @XmlElement(name = "objecttag", type = Objecttag.class),
        @XmlElement(name = "t", type = T.class),
        @XmlElement(name = "fragment", type = Fragment.class),
        @XmlElement(name = "group", type = Group.class)
    })
    protected List<Object> objecttagOrTOrFragment;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "SupersededBy")
    @XmlSchemaType(name = "anySimpleType")
    protected String supersededBy;
    @XmlAttribute(name = "color")
    @XmlSchemaType(name = "anySimpleType")
    protected String color;
    @XmlAttribute(name = "bgcolor")
    @XmlSchemaType(name = "anySimpleType")
    protected String bgcolor;
    @XmlAttribute(name = "p")
    @XmlSchemaType(name = "anySimpleType")
    protected String p;
    @XmlAttribute(name = "Z")
    @XmlSchemaType(name = "anySimpleType")
    protected String z;
    @XmlAttribute(name = "BoundingBox")
    @XmlSchemaType(name = "anySimpleType")
    protected String boundingBox;
    @XmlAttribute(name = "TextFrame")
    @XmlSchemaType(name = "anySimpleType")
    protected String textFrame;
    @XmlAttribute(name = "GroupFrame")
    @XmlSchemaType(name = "anySimpleType")
    protected String groupFrame;
    @XmlAttribute(name = "Valence")
    @XmlSchemaType(name = "anySimpleType")
    protected String valence;
    @XmlAttribute(name = "IgnoreWarnings")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ignoreWarnings;
    @XmlAttribute(name = "Warning")
    @XmlSchemaType(name = "anySimpleType")
    protected String warning;
    @XmlAttribute(name = "Visible")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visible;

    /**
     * Gets the value of the objecttagOrTOrFragment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objecttagOrTOrFragment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjecttagOrTOrFragment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Objecttag }
     * {@link T }
     * {@link Fragment }
     * {@link Group }
     * 
     * 
     */
    public List<Object> getObjecttagOrTOrFragment() {
        if (objecttagOrTOrFragment == null) {
            objecttagOrTOrFragment = new ArrayList<Object>();
        }
        return this.objecttagOrTOrFragment;
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
     * Gets the value of the supersededBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupersededBy() {
        return supersededBy;
    }

    /**
     * Sets the value of the supersededBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupersededBy(String value) {
        this.supersededBy = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the bgcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgcolor() {
        return bgcolor;
    }

    /**
     * Sets the value of the bgcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgcolor(String value) {
        this.bgcolor = value;
    }

    /**
     * Gets the value of the p property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP(String value) {
        this.p = value;
    }

    /**
     * Gets the value of the z property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZ() {
        return z;
    }

    /**
     * Sets the value of the z property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZ(String value) {
        this.z = value;
    }

    /**
     * Gets the value of the boundingBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundingBox() {
        return boundingBox;
    }

    /**
     * Sets the value of the boundingBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundingBox(String value) {
        this.boundingBox = value;
    }

    /**
     * Gets the value of the textFrame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextFrame() {
        return textFrame;
    }

    /**
     * Sets the value of the textFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextFrame(String value) {
        this.textFrame = value;
    }

    /**
     * Gets the value of the groupFrame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupFrame() {
        return groupFrame;
    }

    /**
     * Sets the value of the groupFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupFrame(String value) {
        this.groupFrame = value;
    }

    /**
     * Gets the value of the valence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValence() {
        return valence;
    }

    /**
     * Sets the value of the valence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValence(String value) {
        this.valence = value;
    }

    /**
     * Gets the value of the ignoreWarnings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreWarnings() {
        if (ignoreWarnings == null) {
            return "no";
        } else {
            return ignoreWarnings;
        }
    }

    /**
     * Sets the value of the ignoreWarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreWarnings(String value) {
        this.ignoreWarnings = value;
    }

    /**
     * Gets the value of the warning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarning(String value) {
        this.warning = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisible() {
        if (visible == null) {
            return "yes";
        } else {
            return visible;
        }
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisible(String value) {
        this.visible = value;
    }

}
