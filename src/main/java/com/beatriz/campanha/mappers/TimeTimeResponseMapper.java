package com.beatriz.campanha.mappers;

import com.beatriz.campanha.dto.Responses.TimeResponse;
import com.beatriz.campanha.entities.Time;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TimeTimeResponseMapper {
    Time toEntity(TimeResponse timeResponse);
    TimeResponse toDto(Time time);


}
