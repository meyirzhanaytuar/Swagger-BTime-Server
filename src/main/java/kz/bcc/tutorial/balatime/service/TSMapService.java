package kz.bcc.tutorial.balatime.service;

import kz.bcc.tutorial.balatime.model.TSMap;

import java.util.List;

public interface TSMapService {
    TSMap create(TSMap tSMap);

    TSMap getById(Integer id);

    List<TSMap> getAll();

    void delete(Integer id);
}
