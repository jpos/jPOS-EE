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

package org.jpos.iso20022.seev_001_001_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoteMethods5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VoteMethods5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VoteThrghNtwk" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}VoteThroughNetwork1Choice" minOccurs="0"/>
 *         <element name="VoteByMail" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}MailAddress1" minOccurs="0"/>
 *         <element name="ElctrncVote" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}CommunicationAddress12" maxOccurs="5" minOccurs="0"/>
 *         <element name="VoteByTel" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Max35Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteMethods5", propOrder = {
    "voteThrghNtwk",
    "voteByMail",
    "elctrncVote",
    "voteByTel"
})
public class VoteMethods5 {

    @XmlElement(name = "VoteThrghNtwk")
    protected VoteThroughNetwork1Choice voteThrghNtwk;
    @XmlElement(name = "VoteByMail")
    protected MailAddress1 voteByMail;
    @XmlElement(name = "ElctrncVote")
    protected List<CommunicationAddress12> elctrncVote;
    @XmlElement(name = "VoteByTel")
    protected List<String> voteByTel;

    /**
     * Gets the value of the voteThrghNtwk property.
     * 
     * @return
     *     possible object is
     *     {@link VoteThroughNetwork1Choice }
     *     
     */
    public VoteThroughNetwork1Choice getVoteThrghNtwk() {
        return voteThrghNtwk;
    }

    /**
     * Sets the value of the voteThrghNtwk property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteThroughNetwork1Choice }
     *     
     */
    public void setVoteThrghNtwk(VoteThroughNetwork1Choice value) {
        this.voteThrghNtwk = value;
    }

    /**
     * Gets the value of the voteByMail property.
     * 
     * @return
     *     possible object is
     *     {@link MailAddress1 }
     *     
     */
    public MailAddress1 getVoteByMail() {
        return voteByMail;
    }

    /**
     * Sets the value of the voteByMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailAddress1 }
     *     
     */
    public void setVoteByMail(MailAddress1 value) {
        this.voteByMail = value;
    }

    /**
     * Gets the value of the elctrncVote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the elctrncVote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElctrncVote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationAddress12 }
     * 
     * 
     * @return
     *     The value of the elctrncVote property.
     */
    public List<CommunicationAddress12> getElctrncVote() {
        if (elctrncVote == null) {
            elctrncVote = new ArrayList<>();
        }
        return this.elctrncVote;
    }

    /**
     * Gets the value of the voteByTel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the voteByTel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteByTel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the voteByTel property.
     */
    public List<String> getVoteByTel() {
        if (voteByTel == null) {
            voteByTel = new ArrayList<>();
        }
        return this.voteByTel;
    }

}
