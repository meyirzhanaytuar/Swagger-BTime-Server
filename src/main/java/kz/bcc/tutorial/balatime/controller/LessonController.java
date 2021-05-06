package kz.bcc.tutorial.balatime.controller;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.Lesson;
import kz.bcc.tutorial.balatime.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/lesson", produces = APPLICATION_JSON_VALUE)
public class LessonController {
    @Autowired
    private LessonService lessonService;

    @ApiOperation(value = "Get All lessons")
    @GetMapping("/all")
    public ResponseEntity<List<Lesson>> getAll() {
        return ResponseEntity.ok(lessonService.getAll());
    }

    @ApiOperation(value = "Create or update lesson object")
    @PostMapping()
    public ResponseEntity<Lesson> calculateTestObject(@RequestBody Lesson lesson) {
        return ResponseEntity.ok(lessonService.create(lesson));
    }
    @ApiOperation(value = "Get lessons by id")
    @GetMapping("/id/{id}")
    public ResponseEntity<Lesson> getLessonById(@PathVariable Integer id) {
        return ResponseEntity.ok(lessonService.getById(id));
    }
}
