package com.example.api.mapper;

public interface Mapper<DTO, ENTITY> {

    DTO entityToDTO(ENTITY entity);
}
