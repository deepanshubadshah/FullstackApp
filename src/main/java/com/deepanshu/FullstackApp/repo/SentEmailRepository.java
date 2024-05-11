package com.deepanshu.FullstackApp.repo;

import com.deepanshu.FullstackApp.model.SentEmail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SentEmailRepository extends JpaRepository<SentEmail, Long> {
}
