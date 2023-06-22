package controller;

import dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.IGetAllPersonService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("person")
public class GetAllPersonController {
    private final IGetAllPersonService getAllPersonService;

    @PostMapping("/getAll")
    public List<PersonDTO> getAllPerson() {
        return getAllPersonService.getAllPerson();
    }
}
