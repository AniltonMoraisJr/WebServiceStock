package edu.unifacef.webServiceStock.controller;

import edu.unifacef.webServiceStock.domain.Stock;
import edu.unifacef.webServiceStock.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/stocks")
public class StockController {

    @Autowired
    private StockRepository repo;

    @GetMapping
    public ResponseEntity<List<Stock>> index() {
        return new ResponseEntity<List<Stock>>(this.repo.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Stock> store(@RequestBody @Validated Stock s) {
        s = this.repo.save(s);
        return new ResponseEntity<Stock>(s, HttpStatus.CREATED);
    }


}
