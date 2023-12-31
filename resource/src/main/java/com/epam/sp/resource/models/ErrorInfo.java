package com.epam.sp.resource.models;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ErrorInfo {
    private Date occurredAt;
    private String exception;
    private String requestDetails;
}
