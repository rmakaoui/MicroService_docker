package org.ensaj.voiture.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ensaj.voiture.Client;
import org.springframework.data.annotation.Id;


@jakarta.persistence.Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Voiture{

    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String matricule;
    private String marque;
    private String model;
    @jakarta.persistence.ManyToOne(cascade = CascadeType.ALL)
    @jakarta.persistence.JoinColumn(name = "id_client")
    private Client client;

}
