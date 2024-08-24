package com.employee.Repository;

import com.employee.Model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country , Long> {
    Country findByName(String country);
}
