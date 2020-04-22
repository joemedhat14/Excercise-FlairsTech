package com.example.excersise.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.excersise.model.Country;


@Repository("Dao")
public class CountryDataAccessService implements CountryDao {
private static List<Country> DB = new ArrayList<>();
	@Override
	public int insertCountry(char[] code, Country country) {
		DB.add(new Country(code, country.getName()));
		return 1;
	}
	@Override
	public List<Country> selectAllCountries() {
		return DB;
	}
	
	
	@Override
	public Optional<Country> selectCountryByCode(char[] code) {
		return null; //DB.stream().filter(country -> country.getCode().equals(code)).findFirst();
	}
	
	
	
	@Override
	public int deleteCountry(char[] code) {
		return 0;
	}
	
	
	
	@Override
	public int updateCountry(char[] code) {
		return 0;
	}


}
