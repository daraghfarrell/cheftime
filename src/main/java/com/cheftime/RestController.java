package com.cheftime;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author dfarrell on 13/12/2016.
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/rest-alive")
    public String rlive() {
        return "Rest Service is alive at "+new Date();
    }
}
