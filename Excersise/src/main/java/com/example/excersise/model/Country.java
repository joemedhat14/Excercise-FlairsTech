package com.example.excersise.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {
//	private char[] code;
	private String name;
	private String continent;
	private int population;
	private int life_expectancy;
	private String country_langauage;
//	public Country(@JsonProperty("code") char[] code, @JsonProperty("name") String name,
//			@JsonProperty("continent")String continent,@JsonProperty("population") int population, @JsonProperty("life_expectancy") int life_expectancy) {
//		this.code = code;
//		this.name = name;
//		this.continent=continent;
//		this.population = population;
//		this.life_expectancy = life_expectancy;
//	}
	public Country( @JsonProperty("name") String name,
			@JsonProperty("continent")String continent,@JsonProperty("population") int population, @JsonProperty("life_expectancy") int life_expectancy,
			@JsonProperty("country_language") String country_langauage) {
		this.name = name;
		this.continent =continent; 
		this.population = population;
		this.life_expectancy = life_expectancy;
		this.country_langauage = country_langauage;
	}

	public String getCountry_langauage() {
		return country_langauage;
	}

	public void setCountry_langauage(String country_langauage) {
		this.country_langauage = country_langauage;
	}

	public Country(@JsonProperty("code")char[] code, 
			@JsonProperty("name")String name) {
		this.name = name;
	}

//	public char[] getCode() {
//		return code;
//	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getLife_expectancy() {
		return life_expectancy;
	}

	public void setLife_expectancy(int life_expectancy) {
		this.life_expectancy = life_expectancy;
	}

//	public void setCode(char[] code) {
//		this.code = code;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

}
