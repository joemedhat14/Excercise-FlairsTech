package com.example.excersise.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.excersise.dao.CountryDao;
import com.example.excersise.model.Country;


@Service
public class CountryService {

	private final CountryDao countryDao;
	
	@Autowired
	public CountryService(@Qualifier("postgres")CountryDao countyrDao) {
		this.countryDao=countyrDao;
	}

	public int addCountry(Country country) {
		return countryDao.insertCountry(country);
	}
	
	public List<Country> getAllCountries() throws SQLException
	{
		return  countryDao.selectAllCountries();
	}
	
	public Optional<Country> getCountryByCode(char[] code) throws SQLException{
		return countryDao.selectCountryByCode(code);
	}
	
	
}
