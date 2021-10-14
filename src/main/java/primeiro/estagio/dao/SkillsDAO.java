package primeiro.estagio.dao;

import primeiro.estagio.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsDAO extends JpaRepository<Skill, Long> {



}
