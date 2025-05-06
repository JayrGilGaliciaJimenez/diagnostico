package mx.edu.utez.diagnostico;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@CrossOrigin("*")
@RestController("api/controller/")
public class ApiController {
    @GetMapping("getMessage/")
    public ResponseEntity<Map<String, String>> getMessage() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hola xd");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
