package com.pvelilla.farmuoperations.farmuoperations.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "image")
public class Image {

    @Id
    private Long id;

    private int width;

    private int height;

}
