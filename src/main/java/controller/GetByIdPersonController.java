package controller;

import dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.IGetByIdPersonService;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("person")
public class GetByIdPersonController {
    private final IGetByIdPersonService getByIdPersonService;

    @GetMapping("/getById")
    public ResponseEntity<PersonDTO> getById(@PathVariable String id) {
        return new ResponseEntity<>(getByIdPersonService.getByIdPerson(id), HttpStatus.OK);
    }
}

