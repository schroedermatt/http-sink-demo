package io.confluent.connect.httpsinkdemo.repository;

import io.confluent.connect.httpsinkdemo.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {}
