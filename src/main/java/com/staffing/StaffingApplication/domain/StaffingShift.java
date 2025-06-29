package com.staffing.StaffingApplication.domain; 


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;




@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//-----------entity
@Entity
@Table(name="staffingshift")
public class StaffingShift {

	// @Id
	// @GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "opportunity_id_seq)
	private Long id;
		<xsd:sequence>
			<xsd:element name="Id" type="EntityIdType" minOccurs="0"/>
			<xsd:element name="Name" type="xsd:string" minOccurs="0"/>
			<xsd:element name="Hours" type="xsd:decimal" minOccurs="0"/>
			<xsd:element name="StartTime" type="LocalTimeNkNaType" minOccurs="0"/>
			<xsd:element name="EndTime" type="LocalTimeNkNaType" minOccurs="0"/>
			<xsd:element name="TypeHours" type="xsd:string" minOccurs="0"/>
			<xsd:element name="Comment" type="xsd:string" minOccurs="0"/>
			<xsd:element name="ExternalStaffingShiftSetId" type="EntityIdType" minOccurs="0"/>
		</xsd:sequence>




		<xsd:attribute name="shiftPeriod" type="ShiftPeriodType">
			<xsd:annotation>
				<xsd:documentation> Numeric values conform to: ISO 8601 2nd Edition; ISO8601:2000(E); pub 2010-12-15, Data elements and interchange formats,  Information interchange,  Representation of dates and times,  http://www.iso.ch/cate/d26780.html/ 

				</xsd:documentation>
				<xsd:documentation>1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday, 7 = Sunday</xsd:documentation>
			</xsd:annotation>


	<xsd:simpleType name="ShiftPeriodTypes">
		<xsd:restriction base="xsd:string">
			<xsd:enumeration value="monthly"/>
			<xsd:enumeration value="weekly"/>
			<xsd:enumeration value="daily"/>
			<xsd:enumeration value="1"/>
			<xsd:enumeration value="2"/>
			<xsd:enumeration value="3"/>
			<xsd:enumeration value="4"/>
			<xsd:enumeration value="5"/>
			<xsd:enumeration value="6"/>
			<xsd:enumeration value="7"/>
			<xsd:enumeration value="event"/>
			<xsd:enumeration value="4weekly"/>
		</xsd:restriction>
	</xsd:simpleType>











}