package com.demo.tt.info.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Velmisov Oleg
 * created at 17.02.2022
 **/
@ResponseStatus(HttpStatus.FORBIDDEN)
public class ForbiddebException extends RuntimeException  {
}
