package com.staffing.StaffingApplication.dao.impl;



import com.staffing.StaffingApplication.dao.StaffingOrderDao;
import org.springframework.jdbc.core.JdbcTemplate;



public class StaffingOrderDaoImpln implements StaffingOrderDao{

private Final JdbcTemplate jdbcTemplate;



public StaffingOrderDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}