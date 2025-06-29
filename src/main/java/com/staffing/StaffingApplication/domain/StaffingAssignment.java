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
@Table(name="StaffingAssignment")
public class StaffingAssignment {

	// @Id
	// @GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "opportunity_id_seq)
	private Long id;


	//	<xsd:element name="AssignmentDateRange" minOccurs="0">
	
						private LocalDateTime StartDate;
						private LocalDateTime ExpectedEndDate;
						private LocalDateTime ActualEndDate;//" type="AnyDateTimeNaType" minOccurs="0"/>
						private LocalDateTime FlexibilityMinDate;//" type="AnyDateTimeNaType" minOccurs="0"/>
						private LocalDateTime FlexibilityMaxDate;//" type="AnyDateTimeNaType" minOccurs="0"/>
						private LocalDateTime ProbationaryPeriod;//" minOccurs="0" maxOccurs="unbounded">
						private LocalDateTime EndDate;


						private LocalDateTime EffectiveDate;
						private String SuspensionPeriod;
						private String Comments;
								



					//JobInformation

						private String JobTitle" type="xsd:string" minOccurs="0"/>
						private String JobId" type="xsd:string" minOccurs="0"/>
						private String JobGroup" type="xsd:string" minOccurs="0"/>
						//enum StaffingWorksite" type="StaffingWorkSiteType" minOccurs="0"/>
						private String ShiftType" type="xsd:string" minOccurs="0"/>
						<xsd:element ref="CLAReference" minOccurs="0"/>

			///"HumanResourceInformation" 

						SalaryScale" type="TaxonomyType" minOccurs="0"/>
						InsuranceGroup" type="TaxonomyType" minOccurs="0"/>
						SingleCommuterTrafficDistance" minOccurs="0">
						private AssignmentStatusType assignmentStatus" type="AssignmentStatusType" use="optional"/>
						private String assignmentStatusChangeReason" type="xsd:string" use="optional"/>
						private String EmployeePhase;
						private Boolean EmployeeContractIndicator;
						private Boolean VacationWorkerIndicator;
						private String RecruitedBy;

public enum TypeOfOrganization{

	CUSTOMER,
	SUPPLIER,
	INTERMEDIARY
}

public enum AssignmentStatus{

			ACTIVE,
			INACTIVE,
			SUSPENDED,
			PENDING,
			REVISED,
			CANCELLED,
			ENDED
}



public enum ContractType{

				HUMAN_RESOURCE,
				STAFFING_CUUSTOMER
}



public enum ContractStatus{

			SIGNED,
			UNSIGNED
			

}
}