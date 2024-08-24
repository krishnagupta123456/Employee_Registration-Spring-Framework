package com.employee.Controller;

import com.employee.DTO.StateDTO;
import com.employee.Service.StateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateController {
    private final StateService stateService;

    public StateController(StateService stateService) {
        this.stateService = stateService;
    }
    @PostMapping
    public ResponseEntity<StateDTO> addState(@RequestBody StateDTO state){
        return ResponseEntity.ok(stateService.addState(state));
    }
}
