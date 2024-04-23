package com.spring.boot.mapper;

import com.spring.boot.dto.response.RoleResponse;
import com.spring.boot.dto.resquest.RoleRequest;
import com.spring.boot.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest roleRequest);
    RoleResponse toRoleResponse(Role role);


}
