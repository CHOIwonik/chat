package com.example.demo.repository.chat;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.chat.Chat;

public interface ChatRepository extends JpaRepository<Chat, Long>{

}
