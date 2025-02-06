package com.cinesage.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Movie {

    @Id
    private String movieId;

    @Field
    private String movieName;

    @Field
    private int year;

    @Field
    private HashMap<Celebrity, List<Role>> cast;

    @Field
    private List<Genre> genre;

}
