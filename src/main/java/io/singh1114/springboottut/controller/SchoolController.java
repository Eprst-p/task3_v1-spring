package io.singh1114.springboottut.controller;

import io.singh1114.springboottut.school.School;
import io.singh1114.springboottut.school.SchoolService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schools")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping
    @ApiOperation("Получить все школы")
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }

    @PostMapping
    @ApiOperation("Добавить школу")
    public void addSchool(@RequestBody School school) {
        schoolService.addSchool(school);
    }

    @DeleteMapping("/{schoolId}")
    @ApiOperation("Удалить школу")
    public void removeSchool(@PathVariable String schoolId) {
        schoolService.removeSchool(Long.parseLong(schoolId));
    }

    @PutMapping("/{schoolId}")
    @ApiOperation("Пофиксить школу")
    public void updateSchool(@PathVariable String schoolId, @RequestBody School school) {
        schoolService.updateSchool(school, Long.parseLong(schoolId));
    }
}