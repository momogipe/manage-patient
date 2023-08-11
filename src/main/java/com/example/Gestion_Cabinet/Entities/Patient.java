/*
package com.example.Gestion_Cabinet.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Patient")
@Data
@Builder
public class Patient {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String nom;
    private  String email;
    @OneToMany(mappedBy ="Patient" )
    private Collection<Rendezvous> rendezvous;
}
*/
