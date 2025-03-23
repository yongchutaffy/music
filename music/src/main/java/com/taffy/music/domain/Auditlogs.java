package com.taffy.music.domain;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "AuditLogs")
@Data
public class Auditlogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auditID;

    @ManyToOne
    @JoinColumn(name = "musicID", nullable = false)
    private MusicResources music;

    @ManyToOne
    @JoinColumn(name = "adminID", nullable = false)
    private users admin;

    private String action;
    private String reason;
    private LocalDateTime auditTime;
}

