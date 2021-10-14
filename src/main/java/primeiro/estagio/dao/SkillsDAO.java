package ifpe.primeiroestagio.dao;

import ifpe.primeiroestagio.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsDAO extends JpaRepository<Skill, Long> {



}
