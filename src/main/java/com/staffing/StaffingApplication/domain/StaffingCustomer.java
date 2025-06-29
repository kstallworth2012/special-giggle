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
@Table(name="StaffingCustomer")
public class StaffingCustomer {

	// @Id
	// @GeneratedValue(strategy =GenerationType.SEQUENCE,generator= "opportunity_id_seq)
	private Long id;

}