package br.com.mesttra.medicaldep.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Data
public class Admission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long playerId;

    private String description;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate admissionDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate estimatedReleaseDate;


}
