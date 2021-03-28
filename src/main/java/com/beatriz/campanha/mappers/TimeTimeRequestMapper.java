package com.beatriz.campanha.mappers;

import com.beatriz.campanha.dto.Requests.TimeRequest;
import com.beatriz.campanha.entities.Time;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface TimeTimeRequestMapper {

    Time toEntity(TimeRequest timeRequest);
    TimeRequest toDto(Time time);


    void toEntityUpdate(TimeRequest timeRequest, @MappingTarget Time time);


}
