package com.beatriz.campanha.controllers;

import com.beatriz.campanha.dto.Requests.TimeRequest;
import com.beatriz.campanha.dto.Responses.TimeResponse;
import com.beatriz.campanha.services.TimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController
@RequiredArgsConstructor
@RequestMapping("/time")
public class TimeController {

    private final TimeService timeService;

    @PostMapping
    public ResponseEntity<TimeResponse> salvar (@RequestBody TimeRequest timeRequest){
        TimeResponse timeResponse = timeService.salvar(timeRequest);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand
                (timeResponse.getId()).toUri();
        return ResponseEntity.created(location).body(timeResponse);
    }
}
