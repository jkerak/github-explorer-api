package com.jkerak.repository;

import com.jkerak.entity.Repository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RepositoryRepository extends PagingAndSortingRepository<Repository, Long>{
}
