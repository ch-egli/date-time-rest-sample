package ch.egli.datetimerestsample.controller;

import ch.egli.datetimerestsample.model.Planning;
import ch.egli.datetimerestsample.repository.PlanningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TODO: Describe
 *
 * @author Christian Egli
 * @since 9/5/17.
 */
@RestController
public class PlanningController {

    @Autowired
    private PlanningRepository repo;

    @GetMapping(value = "/plannings")
    public List<Planning> getPlannings() {
        return repo.findAll();
    }

    @PostMapping(value = "/plannings")
    public void createPlanning(@RequestBody Planning p) {
        System.out.println(p.toString());
        repo.save(p);
    }
}
