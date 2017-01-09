package com.jkerak.repository;

import com.jkerak.entity.UserCollection;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserCollectionRepository extends PagingAndSortingRepository<UserCollection, Long> {
}
