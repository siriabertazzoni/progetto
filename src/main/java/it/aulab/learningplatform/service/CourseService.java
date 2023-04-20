package it.aulab.learningplatform.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

// import java.util.List;
// import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import it.aulab.learningplatform.dto.CourseDTO;
import it.aulab.learningplatform.dto.CreateCourseDTO;
import it.aulab.learningplatform.dto.UpdateCourseDTO;

import it.aulab.learningplatform.model.Course;
import it.aulab.learningplatform.repository.CourseRepository;

@Service("courseService")
public class CourseService implements CrudService<CourseDTO, Long, CreateCourseDTO, UpdateCourseDTO>{

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<CourseDTO> readAll() {
        List<CourseDTO> dtos = new ArrayList<CourseDTO>();
        for(Course c : courseRepository.findAll()){
            dtos.add(mapper.map(c, CourseDTO.class));
        }
        return dtos;
    }

    @Override
    public List<CourseDTO> read(Map<String, String> params) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public List<CourseDTO> readOne(UpdateCourseDTO id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readOne'");
    }

    @Override
    public CourseDTO create(Long createDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public CourseDTO update(CreateCourseDTO createDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public CourseDTO delete(UpdateCourseDTO id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
