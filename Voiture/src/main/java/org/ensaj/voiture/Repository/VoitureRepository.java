package org.ensaj.voiture.Repository;

import org.ensaj.voiture.Model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface VoitureRepository extends JpaRepository<Voiture, Long> {

//    @Query("SELECT v FROM Voiture v WHERE v.client.id = :clientId")
//    List<Voiture> findByClientId(@Param("clientId") Long clientId);
}
