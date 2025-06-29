package com.staffing.StaffingApplication.dao.impl;


import com.staffing.StaffingApplication.dao.WorkSiteDao;
import org.springframework.jdbc.core.JdbcTemplate;



public class WorkSiteDaoImpln implements WorkSiteDao{

private Final JdbcTemplate jdbcTemplate;



public WorkSiteDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}

