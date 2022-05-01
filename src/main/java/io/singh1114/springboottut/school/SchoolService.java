package io.singh1114.springboottut.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    public List<School> getAllSchools() {
        List<School> schools = new ArrayList<>();
        schoolRepository.findAll()
                .forEach(schools::add);
        return schools;
    }

    public void addSchool(School school) {
        schoolRepository.save(school);
    }

    public void removeSchool(long id) {
        schoolRepository.deleteById(id);
    }

    public void updateSchool(School school, long id) {
        Optional<School> schoolForUpdate = schoolRepository.findById(id);
        School schoolNew = schoolForUpdate.orElse(new School());
        schoolNew.setName(school.getName());
        schoolNew.setPrinciple(school.getPrinciple());
        schoolNew.setAddress(school.getAddress());
        schoolRepository.save(schoolNew);
    }
}