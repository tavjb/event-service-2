package com.tav.eventservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private long id;
    private String title;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate startDate;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate endDate;
}
