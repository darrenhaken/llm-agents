package com.haken.llmagents.resources;

import com.haken.llmagents.records.Prediction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgentController {

    @GetMapping("/agent")
    public String getAgent() {
        return "Agent";
    }

    @PostMapping
    public String postAgent(Prediction prediction) {
        return "Agent";
    }
}
