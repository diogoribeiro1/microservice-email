package com.email.microservi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.email.microservi.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{

}
