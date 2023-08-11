package com.example.Gestion_Cabinet.Register;

import com.example.Gestion_Cabinet.Entities.Role;
import jakarta.persistence.Entity;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

import java.util.Collection;
@Data
public class RegistrationRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Collection<Role> roles;
}
