package com.employee.Service;

import com.employee.Model.Country;
import com.employee.Repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService {

    private final CountryRepository countryRepository;


    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
    public Country addCountry(Country country){
        countryRepository.save(country);
        return country;
    }
    public Country getCountryById(long id){
        Optional<Country> country=countryRepository.findById(id);
        if(country.isPresent()){
            return country.get();
        }
        return null;
    }
}
