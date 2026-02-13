package com.staffing.StaffingApplication.mappers.impl;



import    com.staffing.StaffingApplication.domain.dto
import    com.staffing.StaffingApplication.domain
import    com.staffing.StaffingApplication.mappers.Mapper;
import org.modelMapper.ModelMapper;
import    org.springframework.stereotype.Component;


@Component
public class MapperImpl implements Mapper<domain object, Dto>{
	
    private ModelMapper modelMapper;

    public MapperImpl(ModelMapper _modelMapper){
        this.modelMapper = _modelMapper; 
    }
	@Override
	public Dto mapTo(Domin object){
	    return modelMapper.map(domainObject, Dto.class);
	}


	@Override 
	public domainObject mapFrom(DTO dto){
	   return modelMapper.map(Dto, domainObject);
	}
}