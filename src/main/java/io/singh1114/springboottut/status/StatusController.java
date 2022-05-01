package io.singh1114.springboottut.status;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @RequestMapping("status")
    public String tellStatus() {
        return "We are up!";
    }
}