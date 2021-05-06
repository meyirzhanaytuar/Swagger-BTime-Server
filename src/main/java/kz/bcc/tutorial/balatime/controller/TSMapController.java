package kz.bcc.tutorial.balatime.controller;

import io.swagger.annotations.ApiOperation;
import kz.bcc.tutorial.balatime.model.TSMap;
import kz.bcc.tutorial.balatime.service.TSMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/private/v1/tSMap", produces = APPLICATION_JSON_VALUE)
public class TSMapController {
    @Autowired
    private TSMapService tSMapService;

    @ApiOperation(value = "Get All TSMaps")
    @GetMapping("/all")
    public ResponseEntity<List<TSMap>> getAll() {
        return ResponseEntity.ok(tSMapService.getAll());
    }

    @ApiOperation(value = "Create or update tSMap object")
    @PostMapping()
    public ResponseEntity<TSMap> calculateTestObject(@RequestBody TSMap tSMap) {
        return ResponseEntity.ok(tSMapService.create(tSMap));
    }
    @ApiOperation(value = "Get tsMap by id")
    @GetMapping("/id/{id}")
    public ResponseEntity<TSMap> getTSMapById(@PathVariable Integer id) {
        return ResponseEntity.ok(tSMapService.getById(id));
    }
}
