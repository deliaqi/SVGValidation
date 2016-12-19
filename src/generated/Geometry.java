//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 04:25:40 PM CST 
//


package generated;

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
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="SupersededBy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="LineWidth" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="GeometricFeature" default="Unknown"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="Unknown"/&gt;
 *             &lt;enumeration value="PointFromPointPointDistance"/&gt;
 *             &lt;enumeration value="PointFromPointPointPercentage"/&gt;
 *             &lt;enumeration value="PointFromPointNormalDistance"/&gt;
 *             &lt;enumeration value="LineFromPoints"/&gt;
 *             &lt;enumeration value="PlaneFromPoints"/&gt;
 *             &lt;enumeration value="PlaneFromPointLine"/&gt;
 *             &lt;enumeration value="CentroidFromPoints"/&gt;
 *             &lt;enumeration value="NormalFromPointPlane"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="RelationValue" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="BasisObjects" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "geometry")
public class Geometry {

    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "SupersededBy")
    @XmlSchemaType(name = "anySimpleType")
    protected String supersededBy;
    @XmlAttribute(name = "color")
    @XmlSchemaType(name = "anySimpleType")
    protected String color;
    @XmlAttribute(name = "Name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "LineWidth")
    @XmlSchemaType(name = "anySimpleType")
    protected String lineWidth;
    @XmlAttribute(name = "GeometricFeature")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String geometricFeature;
    @XmlAttribute(name = "RelationValue")
    @XmlSchemaType(name = "anySimpleType")
    protected String relationValue;
    @XmlAttribute(name = "BasisObjects")
    @XmlSchemaType(name = "anySimpleType")
    protected String basisObjects;

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
     * Gets the value of the lineWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineWidth() {
        return lineWidth;
    }

    /**
     * Sets the value of the lineWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineWidth(String value) {
        this.lineWidth = value;
    }

    /**
     * Gets the value of the geometricFeature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeometricFeature() {
        if (geometricFeature == null) {
            return "Unknown";
        } else {
            return geometricFeature;
        }
    }

    /**
     * Sets the value of the geometricFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeometricFeature(String value) {
        this.geometricFeature = value;
    }

    /**
     * Gets the value of the relationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationValue() {
        return relationValue;
    }

    /**
     * Sets the value of the relationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationValue(String value) {
        this.relationValue = value;
    }

    /**
     * Gets the value of the basisObjects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasisObjects() {
        return basisObjects;
    }

    /**
     * Sets the value of the basisObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasisObjects(String value) {
        this.basisObjects = value;
    }

}
