package kz.bcc.tutorial.balatime.controller;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.Grading;
import kz.bcc.tutorial.balatime.service.GradingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/grading", produces = APPLICATION_JSON_VALUE)
public class GradingController {
    @Autowired
    private GradingService gradingService;

    @ApiOperation(value = "Get All grades")
    @GetMapping("/all")
    public ResponseEntity<List<Grading>> getAll() {
        return ResponseEntity.ok(gradingService.getAll());
    }

    @ApiOperation(value = "Create or update grades object")
    @PostMapping()
    public ResponseEntity<Grading> calculateTestObject(@RequestBody Grading grading) {
        return ResponseEntity.ok(gradingService.create(grading));
    }
    @ApiOperation(value = "Get gradings by id")
    @GetMapping("/id/{id}")
    public ResponseEntity<Grading> getGGradingById(@PathVariable Integer id) {
        return ResponseEntity.ok(gradingService.getById(id));
    }
}
