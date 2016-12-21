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
 *         &lt;element ref="{}t"/&gt;
 *         &lt;element ref="{}fragment"/&gt;
 *         &lt;element ref="{}group"/&gt;
 *         &lt;element ref="{}graphic"/&gt;
 *         &lt;element ref="{}altgroup"/&gt;
 *         &lt;element ref="{}curve"/&gt;
 *         &lt;element ref="{}step"/&gt;
 *         &lt;element ref="{}scheme"/&gt;
 *         &lt;element ref="{}spectrum"/&gt;
 *         &lt;element ref="{}embeddedobject"/&gt;
 *         &lt;element ref="{}sequence"/&gt;
 *         &lt;element ref="{}crossreference"/&gt;
 *         &lt;element ref="{}splitter"/&gt;
 *         &lt;element ref="{}table"/&gt;
 *         &lt;element ref="{}bracketedgroup"/&gt;
 *         &lt;element ref="{}border"/&gt;
 *         &lt;element ref="{}geometry"/&gt;
 *         &lt;element ref="{}constraint"/&gt;
 *         &lt;element ref="{}tlcplate"/&gt;
 *         &lt;element ref="{}chemicalproperty"/&gt;
 *         &lt;element ref="{}arrow"/&gt;
 *         &lt;element ref="{}bioshape"/&gt;
 *         &lt;element ref="{}stoichiometrygrid"/&gt;
 *         &lt;element ref="{}plasmidmap"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="BoundingBox" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="BoundsInParent" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="bgcolor" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="WidthPages" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="1" /&gt;
 *       &lt;attribute name="HeightPages" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="1" /&gt;
 *       &lt;attribute name="PrintTrimMarks" default="no"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="yes"/&gt;
 *             &lt;enumeration value="no"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="PageOverlap" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Header" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="HeaderPosition" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Footer" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="FooterPosition" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="DrawingSpace" default="pages"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="poster"/&gt;
 *             &lt;enumeration value="pages"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="SplitterPositions" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="PageDefinition" default="Undefined"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="Undefined"/&gt;
 *             &lt;enumeration value="Center"/&gt;
 *             &lt;enumeration value="TL4"/&gt;
 *             &lt;enumeration value="IDTerm"/&gt;
 *             &lt;enumeration value="FlushLeft"/&gt;
 *             &lt;enumeration value="FlushRight"/&gt;
 *             &lt;enumeration value="Reaction1"/&gt;
 *             &lt;enumeration value="Reaction2"/&gt;
 *             &lt;enumeration value="MulticolumnTL4"/&gt;
 *             &lt;enumeration value="MulticolumnNonTL4"/&gt;
 *             &lt;enumeration value="UserDefined"/&gt;
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
    "tOrFragmentOrGroup"
})
@XmlRootElement(name = "page")
public class Page {

    @XmlElements({
        @XmlElement(name = "t", type = T.class),
        @XmlElement(name = "fragment", type = Fragment.class),
        @XmlElement(name = "group", type = Group.class),
        @XmlElement(name = "graphic", type = Graphic.class),
        @XmlElement(name = "altgroup", type = Altgroup.class),
        @XmlElement(name = "curve", type = Curve.class),
        @XmlElement(name = "step", type = Step.class),
        @XmlElement(name = "scheme", type = Scheme.class),
        @XmlElement(name = "spectrum", type = Spectrum.class),
        @XmlElement(name = "embeddedobject", type = Embeddedobject.class),
        @XmlElement(name = "sequence", type = Sequence.class),
        @XmlElement(name = "crossreference", type = Crossreference.class),
        @XmlElement(name = "splitter", type = Splitter.class),
        @XmlElement(name = "table", type = Table.class),
        @XmlElement(name = "bracketedgroup", type = Bracketedgroup.class),
        @XmlElement(name = "border", type = Border.class),
        @XmlElement(name = "geometry", type = Geometry.class),
        @XmlElement(name = "constraint", type = Constraint.class),
        @XmlElement(name = "tlcplate", type = Tlcplate.class),
        @XmlElement(name = "chemicalproperty", type = Chemicalproperty.class),
        @XmlElement(name = "arrow", type = Arrow.class),
        @XmlElement(name = "bioshape", type = Bioshape.class),
        @XmlElement(name = "stoichiometrygrid", type = Stoichiometrygrid.class),
        @XmlElement(name = "plasmidmap", type = Plasmidmap.class)
    })
    protected List<Object> tOrFragmentOrGroup;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;
    @XmlAttribute(name = "BoundingBox")
    @XmlSchemaType(name = "anySimpleType")
    protected String boundingBox;
    @XmlAttribute(name = "BoundsInParent")
    @XmlSchemaType(name = "anySimpleType")
    protected String boundsInParent;
    @XmlAttribute(name = "bgcolor")
    @XmlSchemaType(name = "anySimpleType")
    protected String bgcolor;
    @XmlAttribute(name = "WidthPages")
    @XmlSchemaType(name = "anySimpleType")
    protected String widthPages;
    @XmlAttribute(name = "HeightPages")
    @XmlSchemaType(name = "anySimpleType")
    protected String heightPages;
    @XmlAttribute(name = "PrintTrimMarks")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String printTrimMarks;
    @XmlAttribute(name = "Width")
    @XmlSchemaType(name = "anySimpleType")
    protected String width;
    @XmlAttribute(name = "Height")
    @XmlSchemaType(name = "anySimpleType")
    protected String height;
    @XmlAttribute(name = "PageOverlap")
    @XmlSchemaType(name = "anySimpleType")
    protected String pageOverlap;
    @XmlAttribute(name = "Header")
    @XmlSchemaType(name = "anySimpleType")
    protected String header;
    @XmlAttribute(name = "HeaderPosition")
    @XmlSchemaType(name = "anySimpleType")
    protected String headerPosition;
    @XmlAttribute(name = "Footer")
    @XmlSchemaType(name = "anySimpleType")
    protected String footer;
    @XmlAttribute(name = "FooterPosition")
    @XmlSchemaType(name = "anySimpleType")
    protected String footerPosition;
    @XmlAttribute(name = "DrawingSpace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String drawingSpace;
    @XmlAttribute(name = "SplitterPositions")
    @XmlSchemaType(name = "anySimpleType")
    protected String splitterPositions;
    @XmlAttribute(name = "PageDefinition")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pageDefinition;

    /**
     * Gets the value of the tOrFragmentOrGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tOrFragmentOrGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTOrFragmentOrGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link T }
     * {@link Fragment }
     * {@link Group }
     * {@link Graphic }
     * {@link Altgroup }
     * {@link Curve }
     * {@link Step }
     * {@link Scheme }
     * {@link Spectrum }
     * {@link Embeddedobject }
     * {@link Sequence }
     * {@link Crossreference }
     * {@link Splitter }
     * {@link Table }
     * {@link Bracketedgroup }
     * {@link Border }
     * {@link Geometry }
     * {@link Constraint }
     * {@link Tlcplate }
     * {@link Chemicalproperty }
     * {@link Arrow }
     * {@link Bioshape }
     * {@link Stoichiometrygrid }
     * {@link Plasmidmap }
     * 
     * 
     */
    public List<Object> getTOrFragmentOrGroup() {
        if (tOrFragmentOrGroup == null) {
            tOrFragmentOrGroup = new ArrayList<Object>();
        }
        return this.tOrFragmentOrGroup;
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
     * Gets the value of the boundsInParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundsInParent() {
        return boundsInParent;
    }

    /**
     * Sets the value of the boundsInParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundsInParent(String value) {
        this.boundsInParent = value;
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
     * Gets the value of the widthPages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidthPages() {
        if (widthPages == null) {
            return "1";
        } else {
            return widthPages;
        }
    }

    /**
     * Sets the value of the widthPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidthPages(String value) {
        this.widthPages = value;
    }

    /**
     * Gets the value of the heightPages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeightPages() {
        if (heightPages == null) {
            return "1";
        } else {
            return heightPages;
        }
    }

    /**
     * Sets the value of the heightPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeightPages(String value) {
        this.heightPages = value;
    }

    /**
     * Gets the value of the printTrimMarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintTrimMarks() {
        if (printTrimMarks == null) {
            return "no";
        } else {
            return printTrimMarks;
        }
    }

    /**
     * Sets the value of the printTrimMarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintTrimMarks(String value) {
        this.printTrimMarks = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the pageOverlap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageOverlap() {
        return pageOverlap;
    }

    /**
     * Sets the value of the pageOverlap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageOverlap(String value) {
        this.pageOverlap = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the headerPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderPosition() {
        return headerPosition;
    }

    /**
     * Sets the value of the headerPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderPosition(String value) {
        this.headerPosition = value;
    }

    /**
     * Gets the value of the footer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooter() {
        return footer;
    }

    /**
     * Sets the value of the footer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooter(String value) {
        this.footer = value;
    }

    /**
     * Gets the value of the footerPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooterPosition() {
        return footerPosition;
    }

    /**
     * Sets the value of the footerPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooterPosition(String value) {
        this.footerPosition = value;
    }

    /**
     * Gets the value of the drawingSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawingSpace() {
        if (drawingSpace == null) {
            return "pages";
        } else {
            return drawingSpace;
        }
    }

    /**
     * Sets the value of the drawingSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawingSpace(String value) {
        this.drawingSpace = value;
    }

    /**
     * Gets the value of the splitterPositions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitterPositions() {
        return splitterPositions;
    }

    /**
     * Sets the value of the splitterPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitterPositions(String value) {
        this.splitterPositions = value;
    }

    /**
     * Gets the value of the pageDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageDefinition() {
        if (pageDefinition == null) {
            return "Undefined";
        } else {
            return pageDefinition;
        }
    }

    /**
     * Sets the value of the pageDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageDefinition(String value) {
        this.pageDefinition = value;
    }

}
