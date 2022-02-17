package com.demo.tt.info.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author Velmisov Oleg
 * created at 17.02.2022
 **/
@Data
@AllArgsConstructor
public class InfoRequest {

    private final List<String> listA;
    private final List<String> listB;
}
