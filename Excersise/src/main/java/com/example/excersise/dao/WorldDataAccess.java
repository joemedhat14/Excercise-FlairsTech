package com.example.excersise.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.excersise.model.Country;

@Repository("postgres")
public class WorldDataAccess implements CountryDao {
	final JdbcTemplate jdbcTemplate;

	@Autowired
	public WorldDataAccess(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertCountry(char[] code, Country country) {
		return 0;
	}

	@Override
	public List<Country> selectAllCountries() throws SQLException {
		final String sql = "SELECT code, name FROM country;";
		List<Country> cs = jdbcTemplate.query(sql, (resultSet, i) -> {
			if (resultSet.next()) {
				char[] code = resultSet.getString("code").toCharArray();
				System.out.println(code[0]);
				String name = resultSet.getString("name");
				System.out.println(name);
				Country c = new Country(code, name);
				System.out.println(c.getName());
				return c;
			} else
				System.out.println("NULL WAS FOUND");
			return null;
		});
		return cs;
	}

	@Override
	public Optional<Country> selectCountryByCode(char[] code) {
		String stringCode = new String(code);
		final String sql = "SELECT name, continent, population, life_expectancy "
				+ " FROM country WHERE code=" +"'" +stringCode+ "';";
		final String sql_lang = "SELECT language FROM country_language WHERE country_code=" +"'" +stringCode+ "';";
		Country cs = jdbcTemplate.query(sql, (resultSet) -> {
			if (resultSet.next()) {
				String name = resultSet.getString("name");
				String continent = resultSet.getString("continent");
				int population = resultSet.getInt("population");
				int life_expectancy = resultSet.getInt("life_expectancy");
				Country countryFound = new Country(name,continent,population,life_expectancy,"Arabic");
				return countryFound;
			} else return null;
		});
		String country_language = jdbcTemplate.query(sql_lang, (resultSet)->
		{
			if (resultSet.next()) {
			String country_lang = resultSet.getString("language");
			return country_lang;
			}else return null;			
		});
		cs.setCountry_langauage(country_language);
		return Optional.of(cs);
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
