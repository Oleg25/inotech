package com.demo.tt.info.service.impl;

import com.demo.tt.info.service.InfoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Velmisov Oleg
 * created at 17.02.2022
 **/
@Service
public class InfoServiceImpl implements InfoService {


    @Override
    public List<String> getApprovedList() {
        return null;
    }

    @Override
    public List<String> getForbiddenList() {
        return null;
    }
}
