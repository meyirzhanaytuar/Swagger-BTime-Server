package kz.bcc.tutorial.balatime.service.impl;

import kz.bcc.tutorial.balatime.model.Room;
import kz.bcc.tutorial.balatime.repository.RoomRepository;
import kz.bcc.tutorial.balatime.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomRepository roomRepository;

    @Override
    public Room create(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room getById(Integer id) {
        Optional<Room> optionalRoom = roomRepository.findById(id);
        if (optionalRoom.isPresent()) {
            return roomRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Room> getAll() {
        return roomRepository.findAll();
    }

    @Override
    public void delete(Integer id) {

    }
}
