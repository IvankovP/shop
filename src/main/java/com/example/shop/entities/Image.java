package com.example.shop.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(generator = "images_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "images_seq", sequenceName = "images_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "path")
    private String path;

    @Column(name = "main")
    private boolean main;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
}
