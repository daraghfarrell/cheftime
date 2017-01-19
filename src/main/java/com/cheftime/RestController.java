package com.cheftime;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author dfarrell on 13/12/2016.
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/rlive")
    public String rlive() {
        return "\n*****\nrlive: "+new Date()+"\n*****\n";
    }
}
