package com.mmlynarczyk.gym;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

public interface GymRepository extends PagingAndSortingRepository<Gym, Long> {
    List<Gym> findByName(@Param("name") String name);
}
