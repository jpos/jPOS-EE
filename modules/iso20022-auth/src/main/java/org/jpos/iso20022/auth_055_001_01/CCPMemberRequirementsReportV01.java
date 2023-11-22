/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2023 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.iso20022.auth_055_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCPMemberRequirementsReportV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CCPMemberRequirementsReportV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IntraDayRqrmntAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}IntraDayRequirement1" maxOccurs="unbounded"/>
 *         <element name="IntraDayMrgnCall" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}IntraDayMarginCall1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EndOfDayRqrmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}EndOfDayRequirement2" maxOccurs="unbounded"/>
 *         <element name="DfltFndRqrmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}DefaultFundRequirement1" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPMemberRequirementsReportV01", propOrder = {
    "intraDayRqrmntAmt",
    "intraDayMrgnCall",
    "endOfDayRqrmnt",
    "dfltFndRqrmnt",
    "splmtryData"
})
public class CCPMemberRequirementsReportV01 {

    @XmlElement(name = "IntraDayRqrmntAmt", required = true)
    protected List<IntraDayRequirement1> intraDayRqrmntAmt;
    @XmlElement(name = "IntraDayMrgnCall")
    protected List<IntraDayMarginCall1> intraDayMrgnCall;
    @XmlElement(name = "EndOfDayRqrmnt", required = true)
    protected List<EndOfDayRequirement2> endOfDayRqrmnt;
    @XmlElement(name = "DfltFndRqrmnt", required = true)
    protected List<DefaultFundRequirement1> dfltFndRqrmnt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the intraDayRqrmntAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intraDayRqrmntAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntraDayRqrmntAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraDayRequirement1 }
     * 
     * 
     * @return
     *     The value of the intraDayRqrmntAmt property.
     */
    public List<IntraDayRequirement1> getIntraDayRqrmntAmt() {
        if (intraDayRqrmntAmt == null) {
            intraDayRqrmntAmt = new ArrayList<>();
        }
        return this.intraDayRqrmntAmt;
    }

    /**
     * Gets the value of the intraDayMrgnCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intraDayMrgnCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntraDayMrgnCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraDayMarginCall1 }
     * 
     * 
     * @return
     *     The value of the intraDayMrgnCall property.
     */
    public List<IntraDayMarginCall1> getIntraDayMrgnCall() {
        if (intraDayMrgnCall == null) {
            intraDayMrgnCall = new ArrayList<>();
        }
        return this.intraDayMrgnCall;
    }

    /**
     * Gets the value of the endOfDayRqrmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the endOfDayRqrmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndOfDayRqrmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndOfDayRequirement2 }
     * 
     * 
     * @return
     *     The value of the endOfDayRqrmnt property.
     */
    public List<EndOfDayRequirement2> getEndOfDayRqrmnt() {
        if (endOfDayRqrmnt == null) {
            endOfDayRqrmnt = new ArrayList<>();
        }
        return this.endOfDayRqrmnt;
    }

    /**
     * Gets the value of the dfltFndRqrmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dfltFndRqrmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDfltFndRqrmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultFundRequirement1 }
     * 
     * 
     * @return
     *     The value of the dfltFndRqrmnt property.
     */
    public List<DefaultFundRequirement1> getDfltFndRqrmnt() {
        if (dfltFndRqrmnt == null) {
            dfltFndRqrmnt = new ArrayList<>();
        }
        return this.dfltFndRqrmnt;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
