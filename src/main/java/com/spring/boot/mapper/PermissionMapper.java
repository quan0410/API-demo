package com.spring.boot.mapper;

import com.spring.boot.dto.response.PermissionResponse;
import com.spring.boot.dto.resquest.PermissionRequest;
import com.spring.boot.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest permissionRequest);
    PermissionResponse toPermissionResponse(Permission permission);


}
