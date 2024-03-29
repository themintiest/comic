package com.comic.core.entity;

import io.quarkus.security.jpa.RolesValue;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roles_seq")
    @SequenceGenerator(name = "roles_seq", allocationSize = 10)
    public Long id;

    @RolesValue
    @Column(unique = true)
    private String name;

    @Column
    private String description;

    @Column(nullable = false)
    private boolean system;
}
