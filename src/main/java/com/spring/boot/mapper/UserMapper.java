package com.spring.boot.mapper;

import com.spring.boot.dto.response.UserResponse;
import com.spring.boot.dto.resquest.UserCreationRequest;
import com.spring.boot.dto.resquest.UserUpdateRequest;
import com.spring.boot.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
