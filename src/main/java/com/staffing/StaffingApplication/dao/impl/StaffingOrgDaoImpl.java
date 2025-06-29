package com.staffing.StaffingApplication.dao.impl;

import com.staffing.StaffingApplication.dao.StaffingOrgDao;
import org.springframework.jdbc.core.JdbcTemplate;



public class StaffingOrgDaoImpln implements StaffingOrgDao{

private Final JdbcTemplate jdbcTemplate;



public StaffingOrgDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}