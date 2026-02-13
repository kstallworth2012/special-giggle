package com.staffing.StaffingApplication.mappers.impl;



import    com.staffing.StaffingApplication.domain.dto.StaffingInvoiceDto;
import    com.staffing.StaffingApplication.domain.StaffingInvoice;
import    com.staffing.StaffingApplication.mappers.Mapper;
import 	  org.modelMapper.ModelMapper;
import    org.springframework.stereotype.Component;


@Component
public class StaffingInvoiceMapperImpl implements Mapper<StaffingInvoice, StaffingInvoiceDto>{
	
    private ModelMapper modelMapper;

    public StaffingInvoiceMapperImpl(ModelMapper _modelMapper){
        this.modelMapper = _modelMapper; 
    }
	@Override
	public StaffingInvoiceDto mapTo(StaffingInvoice staffingInvoice){
	    return modelMapper.map(staffingInvoice, StaffingInvoiceDto.class);
	}


	@Override 
	public StaffingInvoice mapFrom(staffingInvoiceDTO dto){
	   return modelMapper.map(StaffingInvoiceDto, StaffingInvoice.class);
	}
}