package dev.galileu.hospital.entity;


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
@Data
@Table(name = "equipamentos")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String descricao;
    String fabricante;
    String modelo;
    String num_serie;
    String tag;
    
    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Department department;
}
