package com.douglasdeosouza.fundamentals.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Release {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String releaseDate;
    private String description;


}
