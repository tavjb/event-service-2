package com.tav.eventservice.errors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.Severity;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
    private String message;
}
