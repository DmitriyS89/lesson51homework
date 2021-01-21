package com.example.demo.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="compositions")
@Data
public class Composition {
    @Id
    private int id;

    private Album album;

    private Artist artist;

    @Indexed
    private String date;
}
