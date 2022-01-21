package com.mmlynarczyk.gym;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gym")
@RequiredArgsConstructor
public class GymController {

    private final GymRepository gymRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Gym> getGym(@PathVariable Long id) {
        return gymRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public ResponseEntity<Gym> save(Gym gym) {
        return new ResponseEntity<>(gymRepository.save(gym), HttpStatus.CREATED);
    }

}
