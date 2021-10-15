package primeiro.estagio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import primeiro.estagio.dao.SkillsDAO;
import primeiro.estagio.entities.Skill;

@Service
public class SkillsService {

    @Autowired
    private SkillsDAO skillsDAO;

    public void save(Skill skill){
        skillsDAO.save(skill);
    }
}
