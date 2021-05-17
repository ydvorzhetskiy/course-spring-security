package edu.spingsecurity.rest;

import edu.spingsecurity.dto.CompanyDto;
import edu.spingsecurity.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping("/company")
    public List<CompanyDto> getAll() {
        return companyService.getAll();
    }

    @GetMapping(value = "/company", params = "user-id")
    public List<CompanyDto> getAllByUser(@RequestParam("user-id") long userId) {
        return companyService.getAllByUserId(userId);
    }

    @GetMapping("/company/{id}")
    public CompanyDto getById(@PathVariable("id") long companyId) {
        return companyService.getById(companyId);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/company")
    public CompanyDto create(
        @RequestBody CompanyDto newCompany,
        @RequestParam("user-id") long userId
    ) {
        return companyService.createCompany(newCompany, userId);
    }

    @PutMapping("/company")
    public CompanyDto update(@RequestBody CompanyDto companyDto) {
        return companyService.updateCompany(companyDto);
    }
}
