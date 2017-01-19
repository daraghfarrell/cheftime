package com.cheftime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author dfarrell on 12/12/2016.
 */

@Controller
public class WebController {

    @RequestMapping("/web-alive")
    @ResponseBody
    public String alive() {
        return "Web Service is alive at "+new Date();
    }
}
