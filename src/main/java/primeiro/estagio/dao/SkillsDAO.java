package primeiro.estagio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import primeiro.estagio.entities.Skill;

@Repository
public interface SkillsDAO extends JpaRepository<Skill, Long> {
}
