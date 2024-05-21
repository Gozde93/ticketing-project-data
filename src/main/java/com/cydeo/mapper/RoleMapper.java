package com.cydeo.mapper;

import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {
    public RoleMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    final private ModelMapper modelMapper;

    public Role convertToEntity(RoleDTO dto){
        return modelMapper.map(dto,Role.class);
    }


    public RoleDTO convertToDto(Role entity){
        return modelMapper.map(entity, RoleDTO.class);
    }
}
