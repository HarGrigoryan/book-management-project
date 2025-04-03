package com.example.bookmanagementproject.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "rating_by_star")
@Getter
@Setter
public class RatingByStar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number_of_ratings")
    private Integer numberOfRatings;

    @Column(name = "number_of_five_stars")
    private Integer numberOfFiveStars;

    @Column(name = "number_of_four_stars")
    private Integer numberOfFourStars;

    @Column(name = "number_of_three_stars")
    private Integer numberOfThreeStars;

    @Column(name = "number_of_two_stars")
    private Integer numberOfTwoStars;

    @Column(name = "number_of_1_stars")
    private Integer numberOfOneStars;
}
