package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDate;

public class Action {
    @Id
    private String id;

    @Indexed
    private LocalDate date;

    @DBRef
    private Artist artist;

    @DBRef
    private Album album;

    @DBRef
    private User user;

    @DBRef
    private Composition composition;


}
