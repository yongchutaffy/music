package com.taffy.music.domain;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.time.LocalDateTime;

@Entity
@Table(name = "MusicResources")
@Data
public class MusicResources {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long musicID;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private users user;

    @ManyToOne
    @JoinColumn(name = "categoryID", nullable = false)
    private MusicCategories category;

    private String title;
    private String artist;
    private String album;
    private String filePath;
    private String format;
    private Integer fileSize;
    private LocalDateTime uploadTime;
    private String approvalStatus;

    @Column(columnDefinition = "TEXT")
    private String additionalMetadata;
}
