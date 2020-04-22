package com.example.excersise.apis;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.excersise.model.Country;
import com.example.excersise.service.CountryService;

@RestController
@RequestMapping("/")
public class CountryController {

	private final CountryService countryService;

	@Autowired
	public CountryController(CountryService countryService) {
		this.countryService = countryService;
	}

	@PostMapping
	public void addCountry(@RequestBody Country country) {
		countryService.addCountry(country);
	}

	@GetMapping
	public List<Country> getAllCountries() throws SQLException {
		return countryService.getAllCountries();
	}
	@GetMapping(path = "{code}")
	public Country getCountryByID(@PathVariable("code") char[] code) throws SQLException {
		String countrycode = new String(code);
		return countryService.getCountryByCode(countrycode.toCharArray()).orElse(null);
	}
}
