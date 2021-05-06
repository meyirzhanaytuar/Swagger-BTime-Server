package kz.bcc.tutorial.balatime.controller;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.Group;
import kz.bcc.tutorial.balatime.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/group", produces = APPLICATION_JSON_VALUE)
public class GroupController {
    @Autowired
    private GroupService groupService;

    @ApiOperation(value = "Get All groups")
    @GetMapping("/all")
    public ResponseEntity<List<Group>> getAll() {
        return ResponseEntity.ok(groupService.getAll());
    }

    @ApiOperation(value = "Create or update group object")
    @PostMapping()
    public ResponseEntity<Group> calculateTestObject(@RequestBody Group group) {
        return ResponseEntity.ok(groupService.create(group));
    }
    @ApiOperation(value = "Get groups by id")
    @GetMapping("/id/{id}")
    public ResponseEntity<Group> getGroupById(@PathVariable Integer id) {
        return ResponseEntity.ok(groupService.getById(id));
    }
}
