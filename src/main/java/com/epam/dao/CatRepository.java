package com.epam.dao;

import com.epam.domain.Cat;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends AbstractRepository<Cat, Long> {
}
