package com.example.security.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthResponse
{
    private String token;
    private String refreshToken;
}