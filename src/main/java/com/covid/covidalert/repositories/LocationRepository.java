package com.covid.covidalert.repositories;

import com.covid.covidalert.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
