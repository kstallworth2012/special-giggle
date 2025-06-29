package com.staffing.StaffingApplication.dao.impl;





import com.staffing.StaffingApplication.dao.StaffingCustomerDao; 
import org.springframework.jdbc.core.JdbcTemplate;



public class StaffingCustomerDaoImpln implements StaffingCustomerDao{

private Final JdbcTemplate jdbcTemplate;



public StaffingCustomerDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}
