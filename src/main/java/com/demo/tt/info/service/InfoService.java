package com.demo.tt.info.service;

import java.util.List;

/**
 * @author Velmisov Oleg
 * created at 17.02.2022
 **/
public interface InfoService {

    List<String> getApprovedList();
    List<String> getForbiddenList();

}
