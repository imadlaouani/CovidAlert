package com.covid.covidalert.repositories;

import com.covid.covidalert.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
