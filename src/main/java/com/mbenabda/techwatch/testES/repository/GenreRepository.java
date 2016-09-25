package com.mbenabda.techwatch.testES.repository;

import com.mbenabda.techwatch.testES.domain.Genre;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Genre entity.
 */
@SuppressWarnings("unused")
public interface GenreRepository extends JpaRepository<Genre,Long> {

}
