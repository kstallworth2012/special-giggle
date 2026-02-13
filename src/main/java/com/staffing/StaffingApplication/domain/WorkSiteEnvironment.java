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
@Table(name="WorkSiteEnvironment")
public class WorkSiteEnvironment {

	// @Id
	// @GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "opportunity_id_seq)
	private Long id;
  private String EnvironmentDescription;
  private String EnvironmentName;

  
	/*
			<xsd:element name="" type="xsd:string" minOccurs="0"/>
			<xsd:element name="" type="xsd:string" minOccurs="0"/>
			<xsd:element name="EnvironmentConsideration" minOccurs="0" maxOccurs="unbounded">
				<xsd:complexType>
					<xsd:simpleContent>
						<xsd:extension base="xsd:string">
							<xsd:attribute name="suppliedByOrganization" type="xsd:boolean"/>
							<xsd:attribute name="typeConsideration" use="optional">
								<xsd:simpleType>
									<xsd:restriction base="xsd:string">
										<xsd:enumeration value="General"/>
										<xsd:enumeration value="Physical"/>
										<xsd:enumeration value="SafetyEquipment"/>
										<xsd:enumeration value="DressCode"/>
										<xsd:enumeration value="SafetyAndHygiene"/>



public enum EnvironmentConsideration{
 
  GENERAL,
  PHYSICAL,
  SAFETYEQUIPMENT,
  DRESSCODE,
  SAFETYANDHYGIENE


}
*/

}