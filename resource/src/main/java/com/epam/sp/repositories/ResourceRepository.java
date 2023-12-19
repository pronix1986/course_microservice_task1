package com.epam.sp.repositories;

import com.epam.sp.models.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {
}
