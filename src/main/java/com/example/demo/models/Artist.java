package com.example.demo.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="artists")
@Data
public class Artist {
    @Id
    private int Id;

    @Indexed
    private String name;
}
