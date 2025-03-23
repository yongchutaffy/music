package com.taffy.music.domain;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MusicCategories")
@Data
public class MusicCategories
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryID;

    private String categoryName;
    private String description;
}
