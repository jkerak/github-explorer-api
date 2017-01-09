package com.jkerak.repository;

import com.jkerak.model.UserCollection;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<UserCollection, Long> {
}
