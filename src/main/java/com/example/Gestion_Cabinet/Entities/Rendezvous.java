/*
package com.example.Gestion_Cabinet.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Rendezvous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private Date dateNaissance;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private  Medecin medecin;
    @OneToOne(mappedBy = "rendezvous")
    private  Consultation consultation;

}
*/
