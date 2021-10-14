package primeiro.estagio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import primeiro.estagio.entities.Skill;
import primeiro.estagio.services.SkillsService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {

    @Autowired
    private SkillsService skillsService;

    @GetMapping("/all")
    public ResponseEntity<List<Skill>> findAll() {
        List<Skill> skills = skillsService.findAll();
        return ResponseEntity.ok().body(skills);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Skill> find(@PathVariable Long id) {
        Skill skill = skillsService.findId(id);
        return ResponseEntity.ok().body(skill);
    }

    @PostMapping("/")
    public ResponseEntity<Void> save(@RequestBody Skill skill) throws URISyntaxException {
        skillsService.tosave(skill);
        return ResponseEntity.created(new URI("/http://127.0.0.1:8081/skill/" + skill.getId_skill())).build();
    }

}
