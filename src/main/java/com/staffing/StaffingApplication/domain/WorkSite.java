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
//----------------------
@Entity
@Table(name="WorkSite")
public class WorkSite {

	// @Id
	// @GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "opportunity_id_seq)
	private Long id;
	private String WorkSiteName;
	private String WorkSiteDetail;
/*


		<xsd:element name="WorkSiteName" type="xsd:string" minOccurs="0"/>
			<xsd:element name="WorkSiteDetail" minOccurs="0" maxOccurs="unbounded">
			<xsd:element name="PostalAddress" type="PostalAddressType" minOccurs="0"/>
			<xsd:attribute name="workSiteType" type="xsd:string"/>
							<xsd:element name="TravelDirections" type="xsd:string" minOccurs="0"/>
				<xsd:element name="StructuredTravelDirections" minOccurs="0" maxOccurs="unbounded">
										<xsd:sequence>
							<xsd:element name="StartPoint" type="xsd:string" minOccurs="0"/>
							<xsd:element name="EndPoint" type="xsd:string" minOccurs="0"/>
							<xsd:element name="Transportation" type="xsd:string" minOccurs="0"/>
							<xsd:element name="TimeRequired" minOccurs="0">
							<xsd:element name="MapLink" type="xsd:string" minOccurs="0"/>
							<xsd:element name="Description" type="xsd:string" minOccurs="0"/>
			<xsd:element name="ParkingInstructions" type="xsd:string" minOccurs="0"/>


*/
}
