package com.nomspdx.api.repository;

import com.nomspdx.api.domain.Authority;
import com.nomspdx.api.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
