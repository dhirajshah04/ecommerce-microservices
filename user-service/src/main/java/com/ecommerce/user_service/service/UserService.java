package com.ecommerce.user_service.service;

import com.ecommerce.user_service.Dto.UserRegistrationRequest;
import com.ecommerce.user_service.entity.User;
import com.ecommerce.user_service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    public User registerUser(UserRegistrationRequest request) {
        boolean userExists = userRepository.findByEmail(request.getEmail()).isPresent();
        if (userExists) {
            throw new IllegalArgumentException("User with this email already exists");
        }

        User user = User.builder()
                .fullName(request.getFullName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(request.getRole()) // or assign default: "USER"
                .createdAt(LocalDateTime.now())
                .build();

        return userRepository.save(user);
    }

}
