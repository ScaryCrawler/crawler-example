package com.ilay.redditcrawler.dao;

import com.ilay.redditcrawler.models.BitcoinCurrencyRate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@CrossOrigin(origins = "http://localhost:63343")
@RepositoryRestResource(path = "rates")
public interface BitcoinCurrencyRateRepository extends CrudRepository<BitcoinCurrencyRate, Integer> {
}
