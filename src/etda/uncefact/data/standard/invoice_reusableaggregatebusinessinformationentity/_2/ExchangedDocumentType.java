//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.14 at 02:43:46 PM ICT 
//


package etda.uncefact.data.standard.invoice_reusableaggregatebusinessinformationentity._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import etda.uncefact.data.standard.invoice_qualifieddatatype._1.InvoiceDocumentCodeType;
import etda.uncefact.data.standard.invoice_qualifieddatatype._1.Max256TextType;
import etda.uncefact.data.standard.invoice_qualifieddatatype._1.Max35IDType;
import etda.uncefact.data.standard.invoice_qualifieddatatype._1.Max35TextType;
import etda.uncefact.data.standard.invoice_qualifieddatatype._1.MessageFunctionCodeType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01005861&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;_ Exchanged_ Document. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A collection of data for a Cross Industry Invoice Header () that is exchanged between two or more parties in written, printed or electronic form.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Document&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Exchanged&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Invoicing&lt;/ccts:BusinessProcessContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:GeopoliticalOrRegionContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:GeopoliticalOrRegionContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:OfficialConstraintContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;None&lt;/ccts:OfficialConstraintContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ProductContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:ProductContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:IndustryContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cross Industry&lt;/ccts:IndustryContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessRoleContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:BusinessProcessRoleContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:SupportingRoleContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:SupportingRoleContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:SystemCapabilitiesContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:SystemCapabilitiesContextValue&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ExchangedDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangedDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1}Max35IDType"/>
 *         &lt;element name="Name" type="{urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1}Max35TextType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1}InvoiceDocumentCodeType" minOccurs="0"/>
 *         &lt;element name="IssueDateTime" type="{urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1}ISODateTime"/>
 *         &lt;element name="Purpose" type="{urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1}Max256TextType" minOccurs="0"/>
 *         &lt;element name="PurposeCode" type="{urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1}MessageFunctionCodeType" minOccurs="0"/>
 *         &lt;element name="GlobalID" type="{urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1}Max35IDType" minOccurs="0"/>
 *         &lt;element name="IncludedNote" type="{urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2}NoteType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangedDocumentType", propOrder = {
    "id",
    "name",
    "typeCode",
    "issueDateTime",
    "purpose",
    "purposeCode",
    "globalID",
    "includedNote"
})
public class ExchangedDocumentType {

    @XmlElement(name = "ID", required = true)
    protected Max35IDType id;
    @XmlElement(name = "Name")
    protected Max35TextType name;
    @XmlElement(name = "TypeCode")
    protected InvoiceDocumentCodeType typeCode;
    @XmlElement(name = "IssueDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDateTime;
    @XmlElement(name = "Purpose")
    protected Max256TextType purpose;
    @XmlElement(name = "PurposeCode")
    protected MessageFunctionCodeType purposeCode;
    @XmlElement(name = "GlobalID")
    protected Max35IDType globalID;
    @XmlElement(name = "IncludedNote")
    protected List<NoteType> includedNote;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Max35IDType }
     *     
     */
    public Max35IDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max35IDType }
     *     
     */
    public void setID(Max35IDType value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Max35TextType }
     *     
     */
    public Max35TextType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max35TextType }
     *     
     */
    public void setName(Max35TextType value) {
        this.name = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDocumentCodeType }
     *     
     */
    public InvoiceDocumentCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDocumentCodeType }
     *     
     */
    public void setTypeCode(InvoiceDocumentCodeType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the issueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDateTime() {
        return issueDateTime;
    }

    /**
     * Sets the value of the issueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDateTime(XMLGregorianCalendar value) {
        this.issueDateTime = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link Max256TextType }
     *     
     */
    public Max256TextType getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max256TextType }
     *     
     */
    public void setPurpose(Max256TextType value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the purposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunctionCodeType }
     *     
     */
    public MessageFunctionCodeType getPurposeCode() {
        return purposeCode;
    }

    /**
     * Sets the value of the purposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunctionCodeType }
     *     
     */
    public void setPurposeCode(MessageFunctionCodeType value) {
        this.purposeCode = value;
    }

    /**
     * Gets the value of the globalID property.
     * 
     * @return
     *     possible object is
     *     {@link Max35IDType }
     *     
     */
    public Max35IDType getGlobalID() {
        return globalID;
    }

    /**
     * Sets the value of the globalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max35IDType }
     *     
     */
    public void setGlobalID(Max35IDType value) {
        this.globalID = value;
    }

    /**
     * Gets the value of the includedNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getIncludedNote() {
        if (includedNote == null) {
            includedNote = new ArrayList<NoteType>();
        }
        return this.includedNote;
    }

}