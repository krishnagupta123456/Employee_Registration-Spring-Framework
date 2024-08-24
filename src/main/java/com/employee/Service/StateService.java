package com.employee.Service;

import com.employee.DTO.StateDTO;
import com.employee.Model.Country;
import com.employee.Model.State;
import com.employee.Repository.CountryRepository;
import com.employee.Repository.StateRepository;
import org.springframework.stereotype.Service;

@Service
public class StateService {
    private final StateRepository stateRepository;
    private final CountryRepository countryRepository;


    public StateService(StateRepository stateRepository, CountryRepository countryRepository) {
        this.stateRepository = stateRepository;
        this.countryRepository = countryRepository;
    }
    public StateDTO addState(StateDTO state){
        Country country=countryRepository.findByName(state.getCountry());
        State state1=new State();
        state1.setName(state.getName());
        state1.setCountry(country);
        stateRepository.save(state1);
        return state;
    }
}
