package com.demo.tt.info.api;

import com.demo.tt.info.domain.InfoRequest;
import com.demo.tt.info.domain.InfoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Velmisov Oleg
 * created at 17.02.2022
 **/
@Slf4j
@RequestMapping("/api/v1/requestApproval")
@RestController
public class InfoController {

    @PostMapping
    public ResponseEntity<InfoResponse> getApproval(
            @RequestHeader("Authorization") String auth,
            @RequestBody InfoRequest request
    )  {

        InfoResponse infoResponse = null;

        log.info("im here");

        if (auth.contains("test")) {

            var listA = request.getListA();
            var listB = request.getListB();


            for (int i=0; i< listA.size(); i++) {
                for (int j=0; j< listB.size(); j++) {

                   if (listA.get(i).equals(listB.get(j))) {
                       listB.remove(j);
                    }
                }
            }

            //тут остортированный список
            infoResponse = InfoResponse.builder()
                    .approved(listA)
                    .forbidden(listB)
                    .build();

        } else return new ResponseEntity<>(HttpStatus.FORBIDDEN);


        return new ResponseEntity<>(infoResponse,HttpStatus.OK);
    }


}
