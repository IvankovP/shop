package com.example.shop.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "products")
public class Product extends DeletableEntity {

    @Id
    @GeneratedValue(generator = "products_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "products_seq", sequenceName = "products_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "article")
    private Integer article;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @Column(name = "discount_percentage")
    private Integer discountPercentage;

    @Column(name = "new_arrival")
    private boolean newArrival;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "product")
    private Set<Image> images;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "product")
    private Set<AttributeValue> attributeValues;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_category", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories;

    @OneToMany(mappedBy = "product")
    private Set<ProductRating> ratings;
}
