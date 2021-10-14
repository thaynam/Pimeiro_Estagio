package primeiro.estagio.services;

import primeiro.estagio.dao.SkillsDAO;
import primeiro.estagio.entities.Skill;
import primeiro.estagio.exceptions.BlankException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService {

    @Autowired
    private SkillsDAO skillsDAO;

    public void tosave(Skill skill) {
        skillsDAO.save(skill);
    }

    public List<Skill> findAll() {
        return skillsDAO.findAll();
    }

    public Skill findId(Long id) {
        return skillsDAO.findById(id).get();
    }

    public void todelete(Long id) {
        skillsDAO.deleteById(id);
    }

}
