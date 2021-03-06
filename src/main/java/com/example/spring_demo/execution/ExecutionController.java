package com.example.spring_demo.execution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;

@org.springframework.stereotype.Controller // This means that this class is a Controller
@RequestMapping(path="/executions") // This means URL's start with /demo (after Application path)
public class ExecutionController {

//    @Autowired
//    private ExecutionService service;

    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private ExecutionRepository executionRepository;

//    @PostMapping(path="") // Map ONLY POST Requests
//    public @ResponseBody String addNewExecution (@RequestParam String name
//            , @RequestParam String email) {
//        // @ResponseBody means the returned String is the response, not a view name
//        // @RequestParam means it is a parameter from the GET or POST request
//
//        Execution execution = new Execution();
//        n.setName(name);
//        n.setEmail(email);
//        executionRepository.save(execution);
//        return "Saved";
//    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(path="")
    public @ResponseBody Iterable<Executions> getAllExecutions() {
        // This returns a JSON or XML with the users
        return executionRepository.findAll();
    }

//    @GetMapping(path="", value = "/{id}")
//    public @ResponseBody Iterable<Execution> getExecution(@PathVariable String executionId) {
//        // This returns a JSON or XML with the users
//        return executionRepository.findById(Integer.parseInt(executionId)).get();
//    }
}
