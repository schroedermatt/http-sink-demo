package com.schroedermatt.connect.http.repository;

import com.schroedermatt.connect.http.domain.Message;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends PagingAndSortingRepository<Message, Long> {
}
