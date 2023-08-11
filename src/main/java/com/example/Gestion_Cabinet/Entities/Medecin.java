/*
package com.example.Gestion_Cabinet.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Data
@Builder
@Table(name ="medecin")
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "medecin")
    private Collection<Rendezvous> rendezvous;

}
*/
