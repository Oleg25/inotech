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

            listA.stream().forEach(itemA ->
            {
                listB.stream().forEach(
                        itemB -> {
                            if (itemA.equals(itemB)) {
                                listB.remove(itemA);
                            }
                        }
                );
            });

            //тут остортированный список
            infoResponse = InfoResponse.builder()
                    .approved(listA)
                    .forbidden(listB)
                    .build();

        } else return new ResponseEntity<>(HttpStatus.FORBIDDEN);


        return new ResponseEntity<InfoResponse>(infoResponse,HttpStatus.OK);
    }


}
