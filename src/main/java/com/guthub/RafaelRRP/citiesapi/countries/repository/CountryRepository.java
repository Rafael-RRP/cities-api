package com.guthub.RafaelRRP.citiesapi.countries.repository;

import com.guthub.RafaelRRP.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long > {
}
