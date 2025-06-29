package com.staffing.StaffingApplication.dao.impl;

import com.staffing.StaffingApplication.dao.WorkSiteEnvironmentDao;
import org.springframework.jdbc.core.JdbcTemplate;



public class WorkSiteEnvironmentDaoImpln implements WorkSiteEnvironmentDao{

private Final JdbcTemplate jdbcTemplate;



public WorkSiteEnvironmentDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}