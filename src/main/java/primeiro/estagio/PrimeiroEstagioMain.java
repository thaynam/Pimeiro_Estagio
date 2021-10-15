package primeiro.estagio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import primeiro.estagio.entities.Courses;
import primeiro.estagio.entities.Skill;
import primeiro.estagio.entities.Usuario;
import primeiro.estagio.services.CourseService;
import primeiro.estagio.services.SkillsService;
import primeiro.estagio.services.UsuarioService;

import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
public class PrimeiroEstagioMain implements CommandLineRunner {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private SkillsService skillsService;

    public static void main(String[] args) {
        SpringApplication.run(PrimeiroEstagioMain.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Rodando!");
        Skill skill = new Skill();
        skill.setNomeSkill("Malabarismo");
        skill.setTipoSkill("Util");
        skill.setResumoSkill("AAAAHHHH");
        skill.setAvalSkill("10");
        skill.setDataSkill("14/10/2021");
        List<Skill> skills = new ArrayList<Skill>();
        skills.add(skill);

        Courses course = new Courses();
        course.setCampus("UFPE");
        course.setNome("Ciencias");
        course.setInicio("23/09/1993");
        course.setFim("14/10/2021");
        course.setMod("UM");
        course.setTurno("MANHA");
        course.setSkills(skills);
        List<Courses> courses = new ArrayList<Courses>();
        courses.add(course);

        Usuario usuario = new Usuario();
        usuario.setCpf("123");
        usuario.setDeficiencia("Cegueira");
        usuario.setEmail("jose@gmail.com");
        usuario.setDataNascimento("01/01/1999");
        usuario.setLinguagemPrincipal("Portugues");
        usuario.setNome("José");
        usuario.setPass("n/a");
        usuario.setTelefone("99999999");
        usuario.setEndereco("Casa X");
        usuario.setCourses(courses);
        System.out.println("##############22!!");

        usuarioService.save(usuario);
        courseService.save(course);
        skillsService.save(skill);
        System.out.println("##############33!!");
        System.out.println("##############44!!");

        System.out.println("##############55!!");
    }
}
