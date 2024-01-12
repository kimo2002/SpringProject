package tn.esprit.springproject.modeles;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idChambret; // Clé primaire
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre TypeChambre;

}

