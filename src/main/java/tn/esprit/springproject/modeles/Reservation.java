package tn.esprit.springproject.modeles;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column(name="idReservation")
    private String idReservation; // Clé primaire
    @Temporal(TemporalType.DATE)
    private Date anneeUniveritaire ;
    private boolean estValide;

}
