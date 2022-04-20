package controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @GetMapping("/player")
    public ResponseEntity<String> getPlayer(@RequestParam(value = "playerId", defaultValue = "12345") final String playerId) {
        return ResponseEntity.ok("Hello " + playerId);
    }
}
