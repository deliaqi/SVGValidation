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
 *         &lt;element ref="{}objecttag" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="SupersededBy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="bgcolor" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Z" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="BoundingBox" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="LineType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="Solid"/&gt;
 *             &lt;enumeration value="Dashed"/&gt;
 *             &lt;enumeration value="Bold"/&gt;
 *             &lt;enumeration value="Wavy"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ArrowheadType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="Solid"/&gt;
 *             &lt;enumeration value="Hollow"/&gt;
 *             &lt;enumeration value="Angle"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ArrowheadHead"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="Unspecified"/&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Full"/&gt;
 *             &lt;enumeration value="HalfLeft"/&gt;
 *             &lt;enumeration value="HalfRight"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ArrowheadTail"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="Unspecified"/&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Full"/&gt;
 *             &lt;enumeration value="HalfLeft"/&gt;
 *             &lt;enumeration value="HalfRight"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="HeadSize" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="ArrowheadCenterSize" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="ArrowheadWidth" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="ArrowShaftSpacing" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="ArrowEquilibriumRatio" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="AngularSize" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="NoGo"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="Unspecified"/&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Cross"/&gt;
 *             &lt;enumeration value="Hash"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Dipole" default="no"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="yes"/&gt;
 *             &lt;enumeration value="no"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
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
 *       &lt;attribute name="BoldWidth" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="LineWidth" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="CaptionFont" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="CaptionSize" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="CaptionFace" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Head3D" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Tail3D" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Center3D" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="MajorAxisEnd3D" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="MinorAxisEnd3D" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="ShowAtomEnhancedStereo" default="yes"&gt;
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
    "objecttag"
})
@XmlRootElement(name = "arrow")
public class Arrow {

    protected List<Objecttag> objecttag;
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
    @XmlAttribute(name = "Z")
    @XmlSchemaType(name = "anySimpleType")
    protected String z;
    @XmlAttribute(name = "BoundingBox")
    @XmlSchemaType(name = "anySimpleType")
    protected String boundingBox;
    @XmlAttribute(name = "LineType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lineType;
    @XmlAttribute(name = "ArrowheadType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String arrowheadType;
    @XmlAttribute(name = "ArrowheadHead")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String arrowheadHead;
    @XmlAttribute(name = "ArrowheadTail")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String arrowheadTail;
    @XmlAttribute(name = "HeadSize")
    @XmlSchemaType(name = "anySimpleType")
    protected String headSize;
    @XmlAttribute(name = "ArrowheadCenterSize")
    @XmlSchemaType(name = "anySimpleType")
    protected String arrowheadCenterSize;
    @XmlAttribute(name = "ArrowheadWidth")
    @XmlSchemaType(name = "anySimpleType")
    protected String arrowheadWidth;
    @XmlAttribute(name = "ArrowShaftSpacing")
    @XmlSchemaType(name = "anySimpleType")
    protected String arrowShaftSpacing;
    @XmlAttribute(name = "ArrowEquilibriumRatio")
    @XmlSchemaType(name = "anySimpleType")
    protected String arrowEquilibriumRatio;
    @XmlAttribute(name = "AngularSize")
    @XmlSchemaType(name = "anySimpleType")
    protected String angularSize;
    @XmlAttribute(name = "NoGo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String noGo;
    @XmlAttribute(name = "Dipole")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dipole;
    @XmlAttribute(name = "IgnoreWarnings")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ignoreWarnings;
    @XmlAttribute(name = "Warning")
    @XmlSchemaType(name = "anySimpleType")
    protected String warning;
    @XmlAttribute(name = "Visible")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visible;
    @XmlAttribute(name = "BoldWidth")
    @XmlSchemaType(name = "anySimpleType")
    protected String boldWidth;
    @XmlAttribute(name = "LineWidth")
    @XmlSchemaType(name = "anySimpleType")
    protected String lineWidth;
    @XmlAttribute(name = "CaptionFont")
    @XmlSchemaType(name = "anySimpleType")
    protected String captionFont;
    @XmlAttribute(name = "CaptionSize")
    @XmlSchemaType(name = "anySimpleType")
    protected String captionSize;
    @XmlAttribute(name = "CaptionFace")
    @XmlSchemaType(name = "anySimpleType")
    protected String captionFace;
    @XmlAttribute(name = "Head3D")
    @XmlSchemaType(name = "anySimpleType")
    protected String head3D;
    @XmlAttribute(name = "Tail3D")
    @XmlSchemaType(name = "anySimpleType")
    protected String tail3D;
    @XmlAttribute(name = "Center3D")
    @XmlSchemaType(name = "anySimpleType")
    protected String center3D;
    @XmlAttribute(name = "MajorAxisEnd3D")
    @XmlSchemaType(name = "anySimpleType")
    protected String majorAxisEnd3D;
    @XmlAttribute(name = "MinorAxisEnd3D")
    @XmlSchemaType(name = "anySimpleType")
    protected String minorAxisEnd3D;
    @XmlAttribute(name = "ShowAtomEnhancedStereo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String showAtomEnhancedStereo;

    /**
     * Gets the value of the objecttag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objecttag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjecttag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Objecttag }
     * 
     * 
     */
    public List<Objecttag> getObjecttag() {
        if (objecttag == null) {
            objecttag = new ArrayList<Objecttag>();
        }
        return this.objecttag;
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
     * Gets the value of the lineType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * Sets the value of the lineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineType(String value) {
        this.lineType = value;
    }

    /**
     * Gets the value of the arrowheadType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrowheadType() {
        return arrowheadType;
    }

    /**
     * Sets the value of the arrowheadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrowheadType(String value) {
        this.arrowheadType = value;
    }

    /**
     * Gets the value of the arrowheadHead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrowheadHead() {
        return arrowheadHead;
    }

    /**
     * Sets the value of the arrowheadHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrowheadHead(String value) {
        this.arrowheadHead = value;
    }

    /**
     * Gets the value of the arrowheadTail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrowheadTail() {
        return arrowheadTail;
    }

    /**
     * Sets the value of the arrowheadTail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrowheadTail(String value) {
        this.arrowheadTail = value;
    }

    /**
     * Gets the value of the headSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadSize() {
        return headSize;
    }

    /**
     * Sets the value of the headSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadSize(String value) {
        this.headSize = value;
    }

    /**
     * Gets the value of the arrowheadCenterSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrowheadCenterSize() {
        return arrowheadCenterSize;
    }

    /**
     * Sets the value of the arrowheadCenterSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrowheadCenterSize(String value) {
        this.arrowheadCenterSize = value;
    }

    /**
     * Gets the value of the arrowheadWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrowheadWidth() {
        return arrowheadWidth;
    }

    /**
     * Sets the value of the arrowheadWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrowheadWidth(String value) {
        this.arrowheadWidth = value;
    }

    /**
     * Gets the value of the arrowShaftSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrowShaftSpacing() {
        return arrowShaftSpacing;
    }

    /**
     * Sets the value of the arrowShaftSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrowShaftSpacing(String value) {
        this.arrowShaftSpacing = value;
    }

    /**
     * Gets the value of the arrowEquilibriumRatio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrowEquilibriumRatio() {
        return arrowEquilibriumRatio;
    }

    /**
     * Sets the value of the arrowEquilibriumRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrowEquilibriumRatio(String value) {
        this.arrowEquilibriumRatio = value;
    }

    /**
     * Gets the value of the angularSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAngularSize() {
        return angularSize;
    }

    /**
     * Sets the value of the angularSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAngularSize(String value) {
        this.angularSize = value;
    }

    /**
     * Gets the value of the noGo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoGo() {
        return noGo;
    }

    /**
     * Sets the value of the noGo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoGo(String value) {
        this.noGo = value;
    }

    /**
     * Gets the value of the dipole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDipole() {
        if (dipole == null) {
            return "no";
        } else {
            return dipole;
        }
    }

    /**
     * Sets the value of the dipole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDipole(String value) {
        this.dipole = value;
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

    /**
     * Gets the value of the boldWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoldWidth() {
        return boldWidth;
    }

    /**
     * Sets the value of the boldWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoldWidth(String value) {
        this.boldWidth = value;
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
     * Gets the value of the captionFont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionFont() {
        return captionFont;
    }

    /**
     * Sets the value of the captionFont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionFont(String value) {
        this.captionFont = value;
    }

    /**
     * Gets the value of the captionSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionSize() {
        return captionSize;
    }

    /**
     * Sets the value of the captionSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionSize(String value) {
        this.captionSize = value;
    }

    /**
     * Gets the value of the captionFace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionFace() {
        return captionFace;
    }

    /**
     * Sets the value of the captionFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionFace(String value) {
        this.captionFace = value;
    }

    /**
     * Gets the value of the head3D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHead3D() {
        return head3D;
    }

    /**
     * Sets the value of the head3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHead3D(String value) {
        this.head3D = value;
    }

    /**
     * Gets the value of the tail3D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTail3D() {
        return tail3D;
    }

    /**
     * Sets the value of the tail3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTail3D(String value) {
        this.tail3D = value;
    }

    /**
     * Gets the value of the center3D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenter3D() {
        return center3D;
    }

    /**
     * Sets the value of the center3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenter3D(String value) {
        this.center3D = value;
    }

    /**
     * Gets the value of the majorAxisEnd3D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorAxisEnd3D() {
        return majorAxisEnd3D;
    }

    /**
     * Sets the value of the majorAxisEnd3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorAxisEnd3D(String value) {
        this.majorAxisEnd3D = value;
    }

    /**
     * Gets the value of the minorAxisEnd3D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorAxisEnd3D() {
        return minorAxisEnd3D;
    }

    /**
     * Sets the value of the minorAxisEnd3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorAxisEnd3D(String value) {
        this.minorAxisEnd3D = value;
    }

    /**
     * Gets the value of the showAtomEnhancedStereo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowAtomEnhancedStereo() {
        if (showAtomEnhancedStereo == null) {
            return "yes";
        } else {
            return showAtomEnhancedStereo;
        }
    }

    /**
     * Sets the value of the showAtomEnhancedStereo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowAtomEnhancedStereo(String value) {
        this.showAtomEnhancedStereo = value;
    }

}
