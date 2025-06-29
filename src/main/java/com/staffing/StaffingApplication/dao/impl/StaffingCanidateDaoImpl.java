package com.staffing.StaffingApplication.dao.impl;



import com.staffing.StaffingApplication.dao.StaffingCanidateDao; 
import org.springframework.jdbc.core.JdbcTemplate;



public class StaffingCanidateDaoImpln implements StaffingCanidateDao{

private Final JdbcTemplate jdbcTemplate;



public StaffingCanidateDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}