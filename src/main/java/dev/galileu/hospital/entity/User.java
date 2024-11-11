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
@Table(name = "usuarios")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    
    String nome;
    String email;
    String senha;
    String matricula;
    String fone;

    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Department department;

    /*
     * create table usuarios( id int not null auto_increment primary key, nome varchar(50),
     *  senha varchar(50), matricula varchar(10), setor int, foreign key (setor) references setores(id));

     */

}
