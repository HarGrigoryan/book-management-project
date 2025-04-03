package com.example.bookmanagementproject.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="book")
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="book_id")
    private String bookId;

    @Column(name = "title")
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author")
    private Author author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher")
    private Publisher publisher;

    @Column(name = "publish_date")
    private LocalDate publishDate;

    @Column(name = "first_publish_date")
    private LocalDate firstPublishDate;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "series")
    private Series series;

    @Column(name = "series_number")
    private Integer seriesNumber;

    @Column(name = "description")
    private String description;

    @JoinColumn(name = "book_format")
    @ManyToOne(fetch = FetchType.LAZY)
    private BookFormat bookFormat;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reviews")
    private Reviews reviews;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "language")
    private String language;

    @Column(name = "edition")
    private String edition;

    @Column(name="page_number")
    private Integer pageNumber;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    @OneToMany(mappedBy = "book",cascade = CascadeType.MERGE)
    private List<Character> characters;

    @OneToMany(mappedBy = "book")
    private List<BookGenre> genres;

    @OneToMany(mappedBy = "book")
    private List<BookSetting> bookSetting;
}
