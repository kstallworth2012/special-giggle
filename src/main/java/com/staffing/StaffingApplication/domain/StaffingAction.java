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
@Table(name="StaffingAction")
public class StaffingAction {

	// @Id
	// @GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "opportunity_id_seq)
	private Long id;
	private String staffingActionName;

/*

	xsd:element name="StaffingActionInfo">
				<xsd:complexType>
					<xsd:sequence>
						ActionType" type="StaffingActionByType"/>
						ActionTypeComments" type="xsd:string" minOccurs="0"/>
						ActionReason" minOccurs="0">
							<xsd:complexType>
								<xsd:sequence>
									<xsd:element name="ActionReasonCode" type="StaffingActionReasonCodeType"/>
									<xsd:element name="ActionSubject" type="StaffingActionSubjectType"/>
								</xsd:sequence>
							</xsd:complexType>
						</xsd:element>
					</xsd:sequence>
				</xsd:complexType>
			</xsd:element>
			<xsd:element ref="ReferenceInformation" minOccurs="0"/>
			<xsd:element name="StaffingActionContact" minOccurs="0" maxOccurs="unbounded">
				<xsd:complexType>
					<xsd:sequence>
						<xsd:element name="ReferenceInformation" minOccurs="0">
							<xsd:complexType>
								<xsd:choice>
									<xsd:element name="StaffingSupplierId" type="xsd:string" maxOccurs="unbounded"/>
									<xsd:element name="IntermediaryId" type="xsd:string" minOccurs="0" maxOccurs="unbounded"/>
									<xsd:element name="StaffingCustomerId" type="xsd:string" maxOccurs="unbounded"/>
								</xsd:choice>
							</xsd:complexType>
						</xsd:element>
						<xsd:element ref="EntityContactInfo"/>
					</xsd:sequence>
					<xsd:attribute name="contactType" type="StaffingContactType" use="optional"/>
				</xsd:complexType>
			</xsd:element>
			<xsd:element name="ActionSchedule" minOccurs="0" maxOccurs="unbounded">
				<xsd:complexType>
					<xsd:sequence>
						<xsd:element name="ContactPerson" type="ContactInfoType" minOccurs="0" maxOccurs="unbounded"/>
						<xsd:element name="ContactPeriod" minOccurs="0" maxOccurs="unbounded">
							<xsd:complexType>
								<xsd:sequence>
									<xsd:element name="StartDateTime" type="AnyDateTimeNaType" minOccurs="0"/>
									<xsd:element name="EndDateTime" type="AnyDateTimeNaType" minOccurs="0"/>
								</xsd:sequence>
							</xsd:complexType>
						</xsd:element>
						<xsd:element name="SpecialRequirements" type="xsd:string" minOccurs="0" maxOccurs="unbounded"/>
					</xsd:sequence>
				</xsd:complexType>
			</xsd:element>
			<xsd:element ref="UserArea" minOccurs="0"/>
		</xsd:sequence>
		<xsd:attribute ref="xml:lang"/>
	</xsd:complexType>
	<xsd:element name="StaffingAction" type="StaffingActionType"/>
	public enum StaffingActionType {
			request info"/>
			request action"/>
			request communication"/>
			response info"/>
			response action"/>
}

	// <!-- Action Reason Code  -->
	public enum StaffingActionReason{
		
			Acknowledgement"/>
			Confirmation"/>
			Contract Extension"/>
			Contract Modification"/>
			Contract Expiration"/>
			Assignment Extension"/>
			Assignment Modification"/>
			Modification"/>
			Request"/>
			Cancelled"/>
	}

//	<!-- Action Reason Subject  -->
	public enum StaffingActionReason{
		
			ORDER,
			POSITION,
			ASSIGNMENT,
			STAFFING_SUPPLIER,
			STAFFING_CUSTOMER,
			TIMECARD,
			INVOICE,
			CONTRACT,
			HUMAN_RESOURCE,
			REPORTING
			
		}

*/
}