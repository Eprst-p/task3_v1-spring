package io.singh1114.springboottut.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping("/schools")
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/school")
    public void addSchool(@RequestBody School school) {
        schoolService.addSchool(school);
    }
}