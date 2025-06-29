package com.staffing.StaffingApplication.dao.impl;

import com.staffing.StaffingApplication.dao.ExtendedTimeCardDao;
import org.springframework.jdbc.core.JdbcTemplate;



public class ExtendedTimeCardDaoImpln implements ExtendedTimeCardDao{

private Final JdbcTemplate jdbcTemplate;



public ExtendedTimeCardDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}