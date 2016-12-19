//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 04:25:40 PM CST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
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
 *       &lt;attribute name="XSpacing" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="XLow" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="XType" default="Unknown"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="Unknown"/&gt;
 *             &lt;enumeration value="Wavenumbers"/&gt;
 *             &lt;enumeration value="Microns"/&gt;
 *             &lt;enumeration value="Hertz"/&gt;
 *             &lt;enumeration value="MassUnits"/&gt;
 *             &lt;enumeration value="PartsPerMillion"/&gt;
 *             &lt;enumeration value="Other"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="YType" default="Unknown"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="Unknown"/&gt;
 *             &lt;enumeration value="Absorbance"/&gt;
 *             &lt;enumeration value="Transmittance"/&gt;
 *             &lt;enumeration value="PercentTransmittance"/&gt;
 *             &lt;enumeration value="Other"/&gt;
 *             &lt;enumeration value="ArbitraryUnits"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Class" default="Unknown"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="Unknown"/&gt;
 *             &lt;enumeration value="Chromatogram"/&gt;
 *             &lt;enumeration value="Infrared"/&gt;
 *             &lt;enumeration value="UVVis"/&gt;
 *             &lt;enumeration value="XRayDiffraction"/&gt;
 *             &lt;enumeration value="MassSpectrum"/&gt;
 *             &lt;enumeration value="NMR"/&gt;
 *             &lt;enumeration value="Raman"/&gt;
 *             &lt;enumeration value="Fluorescence"/&gt;
 *             &lt;enumeration value="Atomic"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="XAxisLabel" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="YAxisLabel" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="YLow" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="0" /&gt;
 *       &lt;attribute name="YScale" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="1" /&gt;
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
 *       &lt;attribute name="LabelFont" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="LabelSize" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="LabelFace" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "spectrum")
public class Spectrum {

    @XmlElementRef(name = "objecttag", type = Objecttag.class, required = false)
    @XmlMixed
    protected List<Object> content;
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
    @XmlAttribute(name = "XSpacing")
    @XmlSchemaType(name = "anySimpleType")
    protected String xSpacing;
    @XmlAttribute(name = "XLow")
    @XmlSchemaType(name = "anySimpleType")
    protected String xLow;
    @XmlAttribute(name = "XType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String xType;
    @XmlAttribute(name = "YType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String yType;
    @XmlAttribute(name = "Class")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String clazz;
    @XmlAttribute(name = "XAxisLabel")
    @XmlSchemaType(name = "anySimpleType")
    protected String xAxisLabel;
    @XmlAttribute(name = "YAxisLabel")
    @XmlSchemaType(name = "anySimpleType")
    protected String yAxisLabel;
    @XmlAttribute(name = "YLow")
    @XmlSchemaType(name = "anySimpleType")
    protected String yLow;
    @XmlAttribute(name = "YScale")
    @XmlSchemaType(name = "anySimpleType")
    protected String yScale;
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
    @XmlAttribute(name = "LabelFont")
    @XmlSchemaType(name = "anySimpleType")
    protected String labelFont;
    @XmlAttribute(name = "LabelSize")
    @XmlSchemaType(name = "anySimpleType")
    protected String labelSize;
    @XmlAttribute(name = "LabelFace")
    @XmlSchemaType(name = "anySimpleType")
    protected String labelFace;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Objecttag }
     * {@link String }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
     * Gets the value of the xSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXSpacing() {
        return xSpacing;
    }

    /**
     * Sets the value of the xSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXSpacing(String value) {
        this.xSpacing = value;
    }

    /**
     * Gets the value of the xLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXLow() {
        return xLow;
    }

    /**
     * Sets the value of the xLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXLow(String value) {
        this.xLow = value;
    }

    /**
     * Gets the value of the xType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXType() {
        if (xType == null) {
            return "Unknown";
        } else {
            return xType;
        }
    }

    /**
     * Sets the value of the xType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXType(String value) {
        this.xType = value;
    }

    /**
     * Gets the value of the yType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYType() {
        if (yType == null) {
            return "Unknown";
        } else {
            return yType;
        }
    }

    /**
     * Sets the value of the yType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYType(String value) {
        this.yType = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        if (clazz == null) {
            return "Unknown";
        } else {
            return clazz;
        }
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the xAxisLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAxisLabel() {
        return xAxisLabel;
    }

    /**
     * Sets the value of the xAxisLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXAxisLabel(String value) {
        this.xAxisLabel = value;
    }

    /**
     * Gets the value of the yAxisLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYAxisLabel() {
        return yAxisLabel;
    }

    /**
     * Sets the value of the yAxisLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYAxisLabel(String value) {
        this.yAxisLabel = value;
    }

    /**
     * Gets the value of the yLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYLow() {
        if (yLow == null) {
            return "0";
        } else {
            return yLow;
        }
    }

    /**
     * Sets the value of the yLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYLow(String value) {
        this.yLow = value;
    }

    /**
     * Gets the value of the yScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYScale() {
        if (yScale == null) {
            return "1";
        } else {
            return yScale;
        }
    }

    /**
     * Sets the value of the yScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYScale(String value) {
        this.yScale = value;
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
     * Gets the value of the labelFont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelFont() {
        return labelFont;
    }

    /**
     * Sets the value of the labelFont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelFont(String value) {
        this.labelFont = value;
    }

    /**
     * Gets the value of the labelSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelSize() {
        return labelSize;
    }

    /**
     * Sets the value of the labelSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelSize(String value) {
        this.labelSize = value;
    }

    /**
     * Gets the value of the labelFace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelFace() {
        return labelFace;
    }

    /**
     * Sets the value of the labelFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelFace(String value) {
        this.labelFace = value;
    }

}