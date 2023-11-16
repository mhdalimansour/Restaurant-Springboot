package com.restaurant.restaurant.controllers;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.restaurant.dto.CredentialsDto;
import com.restaurant.restaurant.dto.SignUpDto;
import com.restaurant.restaurant.dto.UserDto;
import com.restaurant.restaurant.security.UserAuthProvidor;
import com.restaurant.restaurant.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class AuthController {

  private final UserService userService;
  private final UserAuthProvidor userAuthProvidor;

  @PostMapping("/login")
  public ResponseEntity<UserDto> login(@RequestBody CredentialsDto credentialsDto) {
    UserDto user = userService.login(credentialsDto);

    user.setToken(userAuthProvidor.createToken(user.getEmail()));

    return ResponseEntity.ok(user);
  }

  @PostMapping("/register")
  public ResponseEntity<UserDto> register(@RequestBody SignUpDto signUpDto) {
    UserDto user = userService.register(signUpDto);
    user.setToken(userAuthProvidor.createToken(user.getEmail()));
    return ResponseEntity.created(URI.create(("/users/" + user.getId()))).body(user);
  }

}
