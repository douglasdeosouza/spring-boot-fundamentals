package com.douglasdeosouza.fundamentals.repository;

import com.douglasdeosouza.fundamentals.entity.Application;
import com.douglasdeosouza.fundamentals.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository  extends CrudRepository<Release, Long> {
}
