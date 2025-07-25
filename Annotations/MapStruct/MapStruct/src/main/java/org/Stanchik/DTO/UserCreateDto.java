package org.Stanchik.DTO;

public record UserCreateDto (
    String username,
    String email,
    String password) {
}

User1