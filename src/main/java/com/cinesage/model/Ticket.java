package com.cinesage.model;

import java.time.LocalDateTime;

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
public class Ticket {

    @Id
    private String ticketId;

    @Field
    private Movie movie;

    @Field
    private LocalDateTime bookingDate;

    @Field
    private LocalDateTime showTiming;

    private User user;

    @Field
    private int count;

    @Field
    private String category;

    @Field
    private Theatre theatre;

}
