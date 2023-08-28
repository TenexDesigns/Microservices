package com.tenex.reviewservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;



@Data
@Entity
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="reviews")
public class ReviewModel {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotNull
    @Column(name = "book_id")
    private String bookId;

    @NotBlank
    @NotNull
    @Column(name = "rating")
    private Integer rating;

    @Column(name = "review")
    @NotNull
    @NotBlank
    private String review;



}
//
//    INSERT INTO reviews (book_id, rating, review)
//    VALUES (4,3 ,'Not exiting');
