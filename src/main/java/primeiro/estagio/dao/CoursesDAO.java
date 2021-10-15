package primeiro.estagio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import primeiro.estagio.entities.Courses;

@Repository
public interface CoursesDAO extends JpaRepository<Courses, Long> {
}
