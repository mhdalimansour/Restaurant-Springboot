package com.restaurant.restaurant.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.restaurant.restaurant.dto.SignUpDto;
import com.restaurant.restaurant.dto.UserDto;
import com.restaurant.restaurant.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

  UserDto toUserDto(User user);

  @Mapping(target = "password", ignore = true)
  User signUpToUser(SignUpDto userDto);

}
