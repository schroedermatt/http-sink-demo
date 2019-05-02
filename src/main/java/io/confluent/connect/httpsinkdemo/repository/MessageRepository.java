package io.confluent.connect.httpsinkdemo.repository;

import io.confluent.connect.httpsinkdemo.domain.Message;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends PagingAndSortingRepository<Message, Long> {
}
