package com.staffing.StaffingApplication.dao.impl;

import com.staffing.StaffingApplication.dao.StaffingInvoiceDao;
import org.springframework.jdbc.core.JdbcTemplate;



public class StaffingInvoiceDaoImpln implements StaffingInvoiceDao{

private Final JdbcTemplate jdbcTemplate;



public StaffingInvoiceDaoImpl(Final JdbcTemplate _jdbcTemplate){

			this.jdbcTemplate = _jdbcTemplate;
		}

}