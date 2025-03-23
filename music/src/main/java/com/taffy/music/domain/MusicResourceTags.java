package com.taffy.music.domain;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "MusicResourceTags")
@Data
@IdClass(MusicResourceTagId.class)
public class MusicResourceTags {
    @Id
    @ManyToOne
    @JoinColumn(name = "musicID")
    private MusicResources music;

    @Id
    @ManyToOne
    @JoinColumn(name = "tagID")
    private MusicTags tag;
}


