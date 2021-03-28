package com.beatriz.campanha.mappers;

import com.beatriz.campanha.dto.Requests.TimeRequest;
import com.beatriz.campanha.entities.Time;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-24T10:19:40-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class TimeTimeRequestMapperImpl implements TimeTimeRequestMapper {

    @Override
    public Time toEntity(TimeRequest timeRequest) {
        if ( timeRequest == null ) {
            return null;
        }

        Time time = new Time();

        time.setNome( timeRequest.getNome() );

        return time;
    }

    @Override
    public TimeRequest toDto(Time time) {
        if ( time == null ) {
            return null;
        }

        TimeRequest timeRequest = new TimeRequest();

        timeRequest.setNome( time.getNome() );

        return timeRequest;
    }

    @Override
    public void toEntityUpdate(TimeRequest timeRequest, Time time) {
        if ( timeRequest == null ) {
            return;
        }

        time.setNome( timeRequest.getNome() );
    }
}
