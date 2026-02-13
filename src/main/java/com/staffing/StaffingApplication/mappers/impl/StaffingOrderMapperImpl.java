package com.staffing.StaffingApplication.mappers.impl;



import    com.staffing.StaffingApplication.domain.dto.StaffingOrderDto;
import    com.staffing.StaffingApplication.domain.StaffingOrder;
import    com.staffing.StaffingApplication.mappers.Mapper;
import org.modelMapper.ModelMapper;
import    org.springframework.stereotype.Component;


@Component
public class StaffingOrderMapperImpl implements Mapper<StaffingOrder, StaffingOrderDto>{
	
    private ModelMapper modelMapper;

    public StaffingOrderMapperImpl(ModelMapper _modelMapper){
        this.modelMapper = _modelMapper; 
    }
	@Override
	public StaffingOrderDto mapTo(StaffingOrder staffingOrder){
	    return modelMapper.map(staffingOrder, StaffingOrderDto.class);
	}


	@Override 
	public StaffingOrder mapFrom(StaffingOrderDto staffingOrderDto){
	   return modelMapper.map(staffingOrderDto, StaffingOrder.class);
	}
}