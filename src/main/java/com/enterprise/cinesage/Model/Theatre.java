package com.enterprise.cinesage.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Theatre {

    @Id
    private String theatreId;

    @Field
    private String theatreName;

    @Field
    private int screenCount;

    @Field
    private Movie currentMovie;

}
