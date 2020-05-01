package dev.zhuozhang.conferencedemo.repositories;

import dev.zhuozhang.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
