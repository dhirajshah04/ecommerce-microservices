package com.ecommerce.user_service.Dto;

import lombok.Data;

@Data
public class UserRegistrationRequest {

    private String fullName;
    private String email;
    private String password;
    private String role; // e.g., "USER", "ADMIN"
}
