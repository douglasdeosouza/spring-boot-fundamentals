package com.douglasdeosouza.fundamentals.repository;

import com.douglasdeosouza.fundamentals.entity.Application;
import org.springframework.data.repository.CrudRepository;


public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
