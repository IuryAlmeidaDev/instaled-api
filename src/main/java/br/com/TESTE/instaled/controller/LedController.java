package  

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/led")
public class LedController {

    private static final Logger logger = LoggerFactory.getLogger(LedController.class);
    private boolean ledState = false;

    @return
    @GetMapping("/state")
    public ResponseEntity<Map<String, Boolean>> getLedState() {
        Map<String, Boolean> response = new HashMap<>();
        response.put("state", this.ledState);
        logger.info("GET /led/state: Retornando estado {}", this.ledState);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/state")
    public ResponseEntity<Map<String, Boolean>> setLedState(@RequestBody Map<String, Boolean> newState) {
        if (newState.containsKey("state")) {
            this.ledState = newState.get("state");
            logger.info("POST /led/state: Novo estado definido para {}", this.ledState);
        }
        return getLedState();
    }
}