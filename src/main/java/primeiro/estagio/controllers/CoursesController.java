package primeiro.estagio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import primeiro.estagio.entities.Courses;
import primeiro.estagio.services.CourseService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody Courses course) throws URISyntaxException{
        courseService.save(course);
        return ResponseEntity.created(new URI("/"+course.getIdCourse())).build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<Courses>> findaAll(){
        List<Courses> courses = courseService.findAll();
        return ResponseEntity.ok().body(courses);
    }


}
