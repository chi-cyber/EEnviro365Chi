package com.enviro.assessment.grad001.chinweachugo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus
public class ResourcesNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;
  public  ResourcesNotFoundException(String message) {
        super(message);
    }
}
