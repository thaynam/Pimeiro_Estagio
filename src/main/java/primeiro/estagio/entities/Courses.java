package primeiro.estagio.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "COURSES")
public class Courses implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long idCourse;

    @OneToMany(cascade = CascadeType.PERSIST, orphanRemoval = true)
    @JoinColumn(name = "id_courses", nullable = true)
    private List<Skill> skills;

    @Column(name = "NOME", nullable = false)
    private String nome;
    @Column(name = "MODULO", nullable = false)
    private String mod;
    @Column(name = "TURNO", nullable = false)
    private String turno;
    @Column(name = "CAMPUS", nullable = false)
    private String campus;
    @Column(name = "INICIO", nullable = false)
    private String inicio;
    @Column(name = "FIM", nullable = false)
    private String fim;
}
