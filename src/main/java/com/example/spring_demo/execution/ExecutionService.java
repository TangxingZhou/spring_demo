package com.example.spring_demo.execution;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExecutionService {

    @Autowired
    private ExecutionRepository repo;

    public List<Executions> listAll() {
        return repo.findAll();
    }

    public void save(Executions execution) {
        repo.save(execution);
    }

    public Executions get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
