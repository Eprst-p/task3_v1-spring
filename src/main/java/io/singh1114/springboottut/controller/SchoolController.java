package io.singh1114.springboottut.controller;

import io.singh1114.springboottut.school.School;
import io.singh1114.springboottut.school.SchoolService;
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

    @DeleteMapping("/school/{schoolId}")
    public void removeSchool(@PathVariable String schoolId) {
        schoolService.removeSchool(Long.parseLong(schoolId));
    }

    @PutMapping("/school/{schoolId}")
    public void updateSchool(@PathVariable String schoolId, @RequestBody School school) {
        schoolService.updateSchool(school, Long.parseLong(schoolId));
    }
}