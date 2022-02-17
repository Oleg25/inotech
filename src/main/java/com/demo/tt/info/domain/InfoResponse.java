package com.demo.tt.info.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Velmisov Oleg
 * created at 17.02.2022
 **/
@Data
@Getter
@Setter
@Builder
public class InfoResponse {

    private final List<String> approved;
    private final List<String> forbidden;
}
