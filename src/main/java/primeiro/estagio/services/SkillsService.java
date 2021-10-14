package ifpe.primeiroestagio.services;

import ifpe.primeiroestagio.dao.SkillsDAO;
import ifpe.primeiroestagio.entities.Skill;
import ifpe.primeiroestagio.exceptions.BlankException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class SkillsService {

    @Autowired
    private SkillsDAO skillsDAO;

    public void tosave(Skill skill) {


        /* validação */
        if (skill.getDataSkill() == "" || skill.getNomeSkill() == "" || skill.getResumoSkill() == "" || skill.getTipoSkill() == "") {
            throw new BlankException("O campo está em branco!");
        }


        /* save */
        try {
            skillsDAO.save(skill);
        } catch (DataIntegrityViolationException e) {

            skillsDAO.save(skill);
        }
    }
}
