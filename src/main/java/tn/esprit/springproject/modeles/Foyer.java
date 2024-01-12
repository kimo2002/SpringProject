package tn.esprit.springproject.modeles;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Foyer implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idFoyer; // Clé primaire
    private String nomFoyer;
    private Long capaciteFoyer;
}

