package primeiro.estagio.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USUARIO")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @OneToMany(cascade = CascadeType.PERSIST, orphanRemoval = true)
    @JoinColumn(name = "ID_USER", nullable = true)
    private List<Courses> courses;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "CPF", nullable = false, unique = true)
    private String cpf;

    @Column(name = "LINGUAGEM_PRINCIPAL")
    private String linguagemPrincipal;

    @Column(name = "DEFICIENCIA", nullable = false)
    private String deficiencia;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "PASS")
    private String pass;

    @Column(name = "TELEFONE", nullable = false)
    private String telefone;

    @Column(name = "DATA_NASCIMENTO", nullable = false)
    private String dataNascimento;

    @Column(name = "ENDERECO", nullable = false)
    private String endereco;
}