package com.tav.eventservice.controllers;

import com.tav.eventservice.errors.exceptions.InvalidInputException;
import com.tav.eventservice.model.Event;
import com.tav.eventservice.services.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("event")
@RestController
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Event create(@RequestBody Event event) throws InvalidInputException {
        return eventService.create(event);
    }

    @GetMapping("{id}")
    public Event get(@PathVariable long id) {
        return eventService.get(id);
    }
}
