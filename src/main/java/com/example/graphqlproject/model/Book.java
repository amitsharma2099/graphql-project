package com.example.graphqlproject.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Book")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
}
