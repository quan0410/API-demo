package com.spring.boot.mapper;

import com.spring.boot.dto.resquest.UserCreationRequest;
import com.spring.boot.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
}
