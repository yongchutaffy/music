package com.taffy.music.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;

@Entity
@Table(name = "RecycleBin")
@Data
public class RecycleBin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RecycleID")
    private Long recycleID;

    @ManyToOne
    @JoinColumn(name = "MusicID", nullable = false)
    private MusicResources music;

    @Column(name = "DeletedAt", nullable = false)
    private LocalDateTime deletedAt;

    @ManyToOne
    @JoinColumn(name = "DeletedBy", nullable = false)
    private users deletedBy;

    @Column(name = "DeletedData", columnDefinition = "JSON")
    private String deletedData;

    @Column(name = "PermanentDeletionTime")
    private LocalDateTime permanentDeletionTime;
}