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
@Table(name="StaffingOrder")
public class StaffingOrder {

	// @Id
	// @GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "staffingOrder_id_seq)
	private Long id;


	private LocalDateTime RequiredResponseDate
	private String reasonForChange;
	private Integer positionQuantity;
	private Integer positionQuantityOpen;
	private Integer daysPerWeek;
	private String candidateRequirements;
	// object StaffingPosition,
	private String OfferRequirements;
	private String OrderComments;
	private KnownOrderStatus orderStatusType; 
    private KnownOrderType orderType; 





/*
			<xsd:sequence>
			<xsd:element name="OrderId" type="EntityIdType"/>
			<xsd:element name="StaffingOfferId" type="EntityIdType" minOccurs="0"/>
			<xsd:element name="StaffingPreviousOrderId" type="EntityIdType" minOccurs="0"/>
			<xsd:element name="StaffingRFQId" type="EntityIdType" minOccurs="0"/>
			<xsd:element name="DocumentationVersionId" type="EntityIdType" minOccurs="0" maxOccurs="unbounded"/>
			<xsd:element ref="ReferenceInformation" minOccurs="0"/>
			<xsd:element ref="CustomerReportingRequirements" minOccurs="0"/>
			<xsd:element name="OrderClassification">
			*/

}