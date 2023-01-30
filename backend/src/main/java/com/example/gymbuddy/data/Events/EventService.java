package com.example.gymbuddy.data.Events;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    Page<Event> findAll(Pageable pageable) {
        return eventRepository.findAll(pageable);
    }
}
