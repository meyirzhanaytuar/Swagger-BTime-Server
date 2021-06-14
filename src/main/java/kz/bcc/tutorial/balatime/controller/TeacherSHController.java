package kz.bcc.tutorial.balatime.controller;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.dto.teacherSH.SchedulerRow;
import kz.bcc.tutorial.balatime.service.TeacherSHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/scheduler/teacher", produces = APPLICATION_JSON_VALUE)
public class TeacherSHController {

    @Autowired
    TeacherSHService teacherSHService;

    @ApiOperation(value = "Get scheduler map")
    @GetMapping("/all/teacherId/{teacherId}")
    public ResponseEntity<List<SchedulerRow>> getAll(
            @PathVariable Integer teacherId,
            @RequestParam Integer year,
            @RequestParam Integer month,
            @RequestParam Integer day)
    {
        return ResponseEntity.ok(teacherSHService.getAll(teacherId, year, month, day));
    }
}
