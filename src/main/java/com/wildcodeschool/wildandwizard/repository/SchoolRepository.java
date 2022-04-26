package com.wildcodeschool.wildandwizard.repository;

import java.util.Optional;

import com.wildcodeschool.wildandwizard.entity.School;
import com.wildcodeschool.wildandwizard.entity.Wizard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// TODO : update this interface
@Repository
public interface SchoolRepository extends JpaRepository<School, Long>{

    // void findAll(); 

    // Optional<School> findById(Long id);

    // void save(School school);

    // void deleteById(Long id);
}
