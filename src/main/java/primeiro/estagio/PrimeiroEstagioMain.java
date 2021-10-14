package primeiro.estagio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import primeiro.estagio.services.CourseService;

@SpringBootApplication
public class PrimeiroEstagioMain implements CommandLineRunner {

    @Autowired
    private CourseService courseService;

    public static void main(String[] args) {
        SpringApplication.run(PrimeiroEstagioMain.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Rodando!");
    }
}
