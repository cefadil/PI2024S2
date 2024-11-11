package dev.galileu.hospital.entity;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "movimentacoes")
@Data
public class Moves {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Equipment equipment;

    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)    
    private User user;

    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Department department;

    private LocalDateTime date; 

    private String observacoes;

}
