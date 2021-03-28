package com.beatriz.campanha.mappers;

import com.beatriz.campanha.dto.Responses.TimeResponse;
import com.beatriz.campanha.entities.Time;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-24T10:19:41-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class TimeTimeResponseMapperImpl implements TimeTimeResponseMapper {

    @Override
    public Time toEntity(TimeResponse timeResponse) {
        if ( timeResponse == null ) {
            return null;
        }

        Time time = new Time();

        time.setId( timeResponse.getId() );
        time.setNome( timeResponse.getNome() );

        return time;
    }

    @Override
    public TimeResponse toDto(Time time) {
        if ( time == null ) {
            return null;
        }

        TimeResponse timeResponse = new TimeResponse();

        timeResponse.setId( time.getId() );
        timeResponse.setNome( time.getNome() );

        return timeResponse;
    }
}
