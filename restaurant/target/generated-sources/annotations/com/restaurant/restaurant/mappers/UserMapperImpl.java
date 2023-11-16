package com.restaurant.restaurant.mappers;

import com.restaurant.restaurant.dto.SignUpDto;
import com.restaurant.restaurant.dto.UserDto;
import com.restaurant.restaurant.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-15T10:23:40+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto.UserDtoBuilder userDto = UserDto.builder();

        userDto.email( user.getEmail() );
        userDto.name( user.getName() );

        return userDto.build();
    }

    @Override
    public User signUpToUser(SignUpDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.email( userDto.getEmail() );
        user.name( userDto.getName() );
        user.phoneNumber( userDto.getPhoneNumber() );

        return user.build();
    }
}
