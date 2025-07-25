package com.example.security.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthRequest
{
    private String username;
    private String password;
    // Getter/setter
}