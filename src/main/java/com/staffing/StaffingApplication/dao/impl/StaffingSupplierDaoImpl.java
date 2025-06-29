package com.staffing.StaffingApplication.dao.impl;








import com.staffing.StaffingApplication.dao.StaffingSupplierDao;
import org.springframework.jdbc.core.JdbcTemplate;



public class StaffingSupplierDaoImpln implements StaffingSupplierDao{

private Final JdbcTemplate jdbcTemplate;



public StaffingSupplierDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}