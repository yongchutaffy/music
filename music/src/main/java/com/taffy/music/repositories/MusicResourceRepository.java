package com.taffy.music.repositories;
import com.taffy.music.domain.MusicResources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicResourceRepository extends JpaRepository <MusicResources, Long> {
}
