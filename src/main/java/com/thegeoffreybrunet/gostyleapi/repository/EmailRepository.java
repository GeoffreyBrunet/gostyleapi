package com.thegeoffreybrunet.gostyleapi.repository;

import com.thegeoffreybrunet.gostyleapi.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}
