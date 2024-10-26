package com.softstrem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softstrem.entities.Category;

@Repository
public interface CategotyRepository extends JpaRepository<Category, Long> {

}
