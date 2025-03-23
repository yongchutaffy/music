package com.taffy.music.repositories;
import com.taffy.music.domain.RecycleBin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecycleBinRepository extends JpaRepository<RecycleBin,Long> {

}
