package io.singh1114.springboottut.standard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StandardController {
    @RequestMapping("/standards")
    public List<Standard> getAllStandards() {
        return Arrays.asList(
                new Standard("1", "A", "Mr. Tom"),
                new Standard("2", "A", "Mr. Charlie"),
                new Standard("3", "A", "Mr. Potter"),
                new Standard("3", "B", "Mr. Read")
        );
    }
}