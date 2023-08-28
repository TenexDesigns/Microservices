package com.tenex.catalogue.service;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;



public class ReviewModel {




    public Long id;


    public String bookId;


    public Integer rating;


    public String review;
