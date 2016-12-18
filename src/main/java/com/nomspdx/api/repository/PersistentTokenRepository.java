package com.nomspdx.api.repository;

import com.nomspdx.api.domain.PersistentToken;
import com.nomspdx.api.domain.User;
import com.nomspdx.api.domain.PersistentToken;
import com.nomspdx.api.domain.User;
import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Spring Data JPA repository for the PersistentToken entity.
 */
public interface PersistentTokenRepository extends JpaRepository<PersistentToken, String> {

    List<PersistentToken> findByUser(User user);

    List<PersistentToken> findByTokenDateBefore(LocalDate localDate);

}
