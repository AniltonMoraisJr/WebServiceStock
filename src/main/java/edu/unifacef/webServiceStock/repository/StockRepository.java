package edu.unifacef.webServiceStock.repository;

import edu.unifacef.webServiceStock.domain.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends MongoRepository<Stock, String> {
}
