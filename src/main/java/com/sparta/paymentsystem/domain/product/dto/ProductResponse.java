package com.sparta.paymentsystem.domain.product.dto;

public record ProductResponse(
        Long id,
        String name,
        int price,
        int stock,
        String description
){
}
//레코드타입 추가 찾기 권장