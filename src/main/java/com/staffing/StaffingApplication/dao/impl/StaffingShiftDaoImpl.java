package com.staffing.StaffingApplication.dao.impl;

import com.staffing.StaffingApplication.dao.StaffingShiftDao;
import org.springframework.jdbc.core.JdbcTemplate;



public class StaffingShiftDaoImpln implements StaffingShiftDao{

private Final JdbcTemplate jdbcTemplate;



public StaffingShiftDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}