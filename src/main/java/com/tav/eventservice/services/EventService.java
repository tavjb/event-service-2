package com.tav.eventservice.services;

import com.tav.eventservice.errors.exceptions.InvalidDateException;
import com.tav.eventservice.errors.exceptions.InvalidInputException;
import com.tav.eventservice.errors.exceptions.InvalidTitleException;
import com.tav.eventservice.model.Event;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EventService {
    public Event create(Event event) throws InvalidInputException {
        if (event.getTitle().length() > 50) {
            throw new InvalidTitleException(event.getTitle());
        }

        if (event.getEndDate().isBefore(event.getStartDate())) {
            throw new InvalidDateException("endDate");
        }
        return event;
    }

    public Event get(long id) {
        return new Event(
                id,
                "whatever",
                LocalDate.of(2022, 5, 5),
                LocalDate.of(2022, 5, 10)
        );
    }
}
