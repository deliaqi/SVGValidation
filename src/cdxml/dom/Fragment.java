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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{}n"/&gt;
 *         &lt;element ref="{}b"/&gt;
 *         &lt;element ref="{}t"/&gt;
 *         &lt;element ref="{}graphic"/&gt;
 *         &lt;element ref="{}curve"/&gt;
 *         &lt;element ref="{}objecttag"/&gt;
 *         &lt;element ref="{}regnum"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="ConnectionOrder" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="BoundingBox" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Racemic" default="no"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="yes"/&gt;
 *             &lt;enumeration value="no"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Absolute" default="no"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="yes"/&gt;
 *             &lt;enumeration value="no"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Relative" default="no"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="yes"/&gt;
 *             &lt;enumeration value="no"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Formula" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Weight" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nOrBOrT"
})
@XmlRootElement(name = "fragment")
public class Fragment {

    @XmlElements({
        @XmlElement(name = "n", type = N.class),
        @XmlElement(name = "b", type = B.class),
        @XmlElement(name = "t", type = T.class),
        @XmlElement(name = "graphic", type = Graphic.class),
        @XmlElement(name = "curve", type = Curve.class),
        @XmlElement(name = "objecttag", type = Objecttag.class),
        @XmlElement(name = "regnum", type = Regnum.class)
    })
    protected List<Object> nOrBOrT;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "ConnectionOrder")
    @XmlSchemaType(name = "anySimpleType")
    protected String connectionOrder;
    @XmlAttribute(name = "BoundingBox")
    @XmlSchemaType(name = "anySimpleType")
    protected String boundingBox;
    @XmlAttribute(name = "Racemic")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String racemic;
    @XmlAttribute(name = "Absolute")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String absolute;
    @XmlAttribute(name = "Relative")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String relative;
    @XmlAttribute(name = "Formula")
    @XmlSchemaType(name = "anySimpleType")
    protected String formula;
    @XmlAttribute(name = "Weight")
    @XmlSchemaType(name = "anySimpleType")
    protected String weight;

    /**
     * Gets the value of the nOrBOrT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nOrBOrT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNOrBOrT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link N }
     * {@link B }
     * {@link T }
     * {@link Graphic }
     * {@link Curve }
     * {@link Objecttag }
     * {@link Regnum }
     * 
     * 
     */
    public List<Object> getNOrBOrT() {
        if (nOrBOrT == null) {
            nOrBOrT = new ArrayList<Object>();
        }
        return this.nOrBOrT;
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
     * Gets the value of the connectionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionOrder() {
        return connectionOrder;
    }

    /**
     * Sets the value of the connectionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionOrder(String value) {
        this.connectionOrder = value;
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
     * Gets the value of the racemic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRacemic() {
        if (racemic == null) {
            return "no";
        } else {
            return racemic;
        }
    }

    /**
     * Sets the value of the racemic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRacemic(String value) {
        this.racemic = value;
    }

    /**
     * Gets the value of the absolute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsolute() {
        if (absolute == null) {
            return "no";
        } else {
            return absolute;
        }
    }

    /**
     * Sets the value of the absolute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsolute(String value) {
        this.absolute = value;
    }

    /**
     * Gets the value of the relative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelative() {
        if (relative == null) {
            return "no";
        } else {
            return relative;
        }
    }

    /**
     * Sets the value of the relative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelative(String value) {
        this.relative = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

}
