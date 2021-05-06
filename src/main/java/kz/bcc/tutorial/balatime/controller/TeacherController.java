package kz.bcc.tutorial.balatime.controller;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.Teacher;
import kz.bcc.tutorial.balatime.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/teacher", produces = APPLICATION_JSON_VALUE)
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "Get All teachers")
    @GetMapping("/all")
    public ResponseEntity<List<Teacher>> getAll() {
        return ResponseEntity.ok(teacherService.getAll());
    }

    @ApiOperation(value = "Create or update teacher object")
    @PostMapping()
    public ResponseEntity<Teacher> calculateTestObject(@RequestBody Teacher teacher) {
        return ResponseEntity.ok(teacherService.create(teacher));
    }
    @ApiOperation(value = "Get teachers by id")
    @GetMapping("/id/{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable Integer id) {
        return ResponseEntity.ok(teacherService.getById(id));
    }
}
