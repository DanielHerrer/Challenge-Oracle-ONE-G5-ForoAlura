package alura.foro.api.infra.errores;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> errorEntityNotFoundException(Exception e) {
        return ResponseEntity.badRequest().body("¡Este elemento no existe!");
    }

    @ExceptionHandler(ValidacionIntegridad.class)
    public ResponseEntity<String> errorHandlerValidacionesDeNegocio(Exception e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<String> errorNotSupportedException(Exception e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

}
