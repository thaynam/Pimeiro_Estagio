package primeiro.estagio.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SKILLS")
public class Skill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_skill", nullable = false)
    private Long id_skill;

    @OneToMany
    @JoinColumn(name = "id_course", nullable = false)
    /* private TABLE_NAME COLUMN_NAME */
    private Long id_course;


    @Column(name = "tipoSkill", nullable = false)
    private String tipoSkill;

    @Column(name = "nomeSkill", nullable = false)
    private String nomeSkill;

    @Column(name = "dataSkill", nullable = false)
    private String dataSkill;

    @Column(name = "resumoSkill", nullable = false)
    private String resumoSkill;

    @Column(name = "avalSkill", nullable = false)
    private Long avalSkill;
}
