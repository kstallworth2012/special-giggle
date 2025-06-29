package com.staffing.StaffingApplication.dao.impl;


import com.staffing.StaffingApplication.dao.StaffingAssignmentDao;
import org.springframework.jdbc.core.JdbcTemplate;



public class StaffingAssignmentDaoImpln implements StaffingAssignmentDao{

private Final JdbcTemplate jdbcTemplate;



public StaffingAssignmentDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}