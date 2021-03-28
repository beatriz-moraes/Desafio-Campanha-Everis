package com.beatriz.campanha.services;

import com.beatriz.campanha.dto.Requests.TimeRequest;
import com.beatriz.campanha.dto.Responses.TimeResponse;
import com.beatriz.campanha.entities.Time;
import com.beatriz.campanha.mappers.TimeTimeRequestMapper;
import com.beatriz.campanha.mappers.TimeTimeResponseMapper;
import com.beatriz.campanha.repositories.TimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class TimeService {

    private final TimeRepository timeRepository;

    private final TimeTimeRequestMapper timeTimeRequestMapper;
    private final TimeTimeResponseMapper timeTimeResponseMapper;

    public TimeResponse salvar(TimeRequest timeRequest) {
        Time time = timeTimeRequestMapper.toEntity(timeRequest);

        timeRepository.save(time);

        TimeResponse timeResponse = timeTimeResponseMapper.toDto(time);

        return timeResponse;
    }
}
