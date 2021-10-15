package primeiro.estagio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import primeiro.estagio.dao.CoursesDAO;
import primeiro.estagio.entities.Courses;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CoursesDAO coursesDAO;

    public void save(Courses course){
        coursesDAO.save(course);
    }

    public List<Courses> findAll(){
        return coursesDAO.findAll();
    }

    public Courses find(Long id){
        return coursesDAO.findById(id).get();
    }
}
