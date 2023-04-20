package it.aulab.learningplatform.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.aulab.learningplatform.dto.CourseDTO;
import it.aulab.learningplatform.dto.CreateCourseDTO;
import it.aulab.learningplatform.dto.UpdateCourseDTO;
import it.aulab.learningplatform.service.CourseService;
import it.aulab.learningplatform.service.CrudService;

@RestController
@RequestMapping("api/courses")
public class RestCourseController {
    
    // @Autowired
    // @Qualifier("courseService")
    private CrudService<CourseDTO, Long, CreateCourseDTO, UpdateCourseDTO> courseService;

    @Autowired
    private CourseService courseServiceImpl;

    @GetMapping
    public List<CourseDTO> get(@RequestParam Map<String, String> params){
        // for(String p: params.keySet()){
        //     System.out.println(p);
        //     System.out.println(params.get(p));
        // }
        return courseService.readAll();
    }


}
