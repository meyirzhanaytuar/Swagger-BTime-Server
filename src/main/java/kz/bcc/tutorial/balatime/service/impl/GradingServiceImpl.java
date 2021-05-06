package kz.bcc.tutorial.balatime.service.impl;

import kz.bcc.tutorial.balatime.model.Grading;
import kz.bcc.tutorial.balatime.repository.GradingRepository;
import kz.bcc.tutorial.balatime.service.GradingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GradingServiceImpl implements GradingService {
    @Autowired
    GradingRepository gradingRepository;

    @Override
    public Grading create(Grading grading) {
        return gradingRepository.save(grading);
    }

    @Override
    public Grading getById(Integer id) {
        Optional<Grading> optionalGrading = gradingRepository.findById(id);
        if (optionalGrading.isPresent()) {
            return gradingRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Grading> getAll() {
        return gradingRepository.findAll();
    }

    @Override
    public void delete(Integer id) {

    }
}
