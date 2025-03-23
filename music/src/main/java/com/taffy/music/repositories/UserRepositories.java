package com.taffy.music.repositories;
import com.taffy.music.domain.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepositories extends JpaRepository< users,Long> {
    users findByEmail(String email);
}
