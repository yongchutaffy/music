package com.taffy.music.domain;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "MusicTags")
@Data
public class MusicTags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tagID;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = true)
    private users user;

    private String tagName;
}
