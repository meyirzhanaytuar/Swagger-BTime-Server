package kz.bcc.tutorial.balatime.controller;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.TimeTable;
import kz.bcc.tutorial.balatime.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/timeTable", produces = APPLICATION_JSON_VALUE)
public class TimeTableController {
    @Autowired
    private TimeTableService timeTableService;

    @ApiOperation(value = "Get All timeTables")
    @GetMapping("/all")
    public ResponseEntity<List<TimeTable>> getAll() {
        return ResponseEntity.ok(timeTableService.getAll());
    }

    @ApiOperation(value = "Create or update timeTable object")
    @PostMapping()
    public ResponseEntity<TimeTable> calculateTestObject(@RequestBody TimeTable timeTable) {
        return ResponseEntity.ok(timeTableService.create(timeTable));
    }
    @ApiOperation(value = "Get timeTable by id")
    @GetMapping("/id/{id}")
    public ResponseEntity<TimeTable> getTimeTableById(@PathVariable Integer id) {
        return ResponseEntity.ok(timeTableService.getById(id));
    }
}
