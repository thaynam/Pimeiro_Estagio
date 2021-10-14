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

        /* validação */
        /*if (skill.getDataSkill() == "" || skill.getNomeSkill() == "" || skill.getResumoSkill() == "" || skill.getTipoSkill() == "") {
            throw new BlankException("O campo está em branco!");
        }*/

        /* save & exceptions */
        /*try {
            skillsDAO.save(skill);
        } catch (DataIntegrityViolationException e) {
            skillsDAO.save(skill);
        }*/
    }

    public List<Skill> findAll() {
        return skillsDAO.findAll();
    }

    public Skill findId(Long id) {
        return skillsDAO.findById(id).get();
    }
}
