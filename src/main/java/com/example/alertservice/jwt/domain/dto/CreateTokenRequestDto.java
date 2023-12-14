package com.example.alertservice.jwt.domain.dto;

import lombok.Data;

@Data
public class CreateTokenRequestDto {

    private final Long id;
    private final String email;
    private final String memberType;
    private final String bno;
    private final String token;

    public CreateTokenRequestDto() {
        this.id = null;
        this.email = null;
        this.memberType = null;
        this.bno = null;
        this.token = null;
    }
}