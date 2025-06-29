package com.staffing.StaffingApplication.dao.impl;

import com.staffing.StaffingApplication.dao.StaffinActionDao;
import org.springframework.jdbc.core.JdbcTemplate;



public class StaffinActionDaoImpln implements StaffinActionDao{

private Final JdbcTemplate jdbcTemplate;



public StaffinActionDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}