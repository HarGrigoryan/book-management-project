package com.example.bookmanagementproject.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "reviews")
@Getter
@Setter
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "book_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Book book;

    @Column(name = "rating")
    private Float rating;

    @JoinColumn(name = "rating_by_stars")
    @OneToOne(fetch = FetchType.LAZY)
    private RatingByStar ratingByStar;

    @Column(name = "liked_percent")
    private Float likedPercent;

    @Column(name = "bbe_score")
    private Integer bbeScore;

    @Column(name = "bbe_votes")
    private Integer bbeVotes;


}
