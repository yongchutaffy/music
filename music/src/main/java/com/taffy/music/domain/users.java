package com.taffy.music.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "Users")
@Data
public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;

    private String name;
    private String email;
    private String avatar;
    private String password;
    private String role;
    private Boolean verificationStatus;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
