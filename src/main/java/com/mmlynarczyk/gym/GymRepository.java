package com.mmlynarczyk.gym;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;

public interface GymRepository extends PagingAndSortingRepository<Gym, Long> {
    List<Gym> findByName(@Param("name") String name);

    Optional<Gym> findByCode(String code);

}
