package com.example.demo.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="albums")
@Data
public class Album {
    @Id
    private int id;

    @Indexed
    private String name;

    @Indexed
    private Artist artist;

    @Indexed
    private String date;


}
