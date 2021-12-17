package com.example.jantrikShop.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "categories")
public class Category extends DeletableEntity {

    @Id
    @GeneratedValue(generator = "categories_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "categories_seq", sequenceName = "categories_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "name")
    private String name;
}
