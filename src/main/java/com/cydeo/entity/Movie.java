package com.cydeo.entity;

import com.cydeo.enums.State;
import com.cydeo.enums.Type;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Enumerated(EnumType.STRING)
    private State state;

    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;

    @ManyToMany
    @JoinTable(name="movie_genre_rel")
    private List<Genre> genre;

    private Double duration;

    private String summary;


    public Movie(String name, BigDecimal price, Type type, State state, LocalDate releaseDate, Double duration, String summary) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.state = state;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.summary = summary;
    }
}
