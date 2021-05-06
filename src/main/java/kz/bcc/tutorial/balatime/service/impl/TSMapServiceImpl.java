package kz.bcc.tutorial.balatime.service.impl;

import kz.bcc.tutorial.balatime.model.TSMap;
import kz.bcc.tutorial.balatime.repository.TSMapRepository;
import kz.bcc.tutorial.balatime.service.TSMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TSMapServiceImpl implements TSMapService {
    @Autowired
    TSMapRepository tSMapRepository;

    @Override
    public TSMap create(TSMap tSMap) {
        return tSMapRepository.save(tSMap);
    }

    @Override
    public TSMap getById(Integer id) {
        Optional<TSMap> optionalTSMap = tSMapRepository.findById(id);
        if (optionalTSMap.isPresent()) {
            return tSMapRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<TSMap> getAll() {
        return tSMapRepository.findAll();
    }

    @Override
    public void delete(Integer id) {

    }
}
