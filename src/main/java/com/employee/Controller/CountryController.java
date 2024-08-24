package com.employee.Controller;

import com.employee.Model.Country;
import com.employee.Service.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country")
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }
    @PostMapping
    public ResponseEntity<Country> addCountry(@RequestBody Country country){
        return ResponseEntity.ok(countryService.addCountry(country));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable  long id) {
        return ResponseEntity.ok(countryService.getCountryById(id));
    }
}
