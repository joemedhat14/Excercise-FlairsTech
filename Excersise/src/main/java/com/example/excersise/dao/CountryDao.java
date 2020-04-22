package com.example.excersise.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.example.excersise.model.Country;


public interface CountryDao {
	int insertCountry(char[] code, Country country);
	
	default int insertCountry(Country country)
	{	char[] code = {'B','H','R'};
		return insertCountry(code, country);
	}
	List<Country> selectAllCountries() throws SQLException;
	Optional<Country> selectCountryByCode(char[] code);
	int deleteCountry(char[] code);
	int updateCountry(char[]code);
}
