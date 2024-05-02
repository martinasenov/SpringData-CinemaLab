package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private MovieCinema movieCinema;

    @ManyToOne
    private UserAccount userAccount;


    private LocalDateTime date_time;
    private Integer seat_number;
    private Integer row_number;


    public Ticket(LocalDateTime date_time, Integer seat_number, Integer row_number) {
        this.date_time = date_time;
        this.seat_number = seat_number;
        this.row_number = row_number;
    }
}
