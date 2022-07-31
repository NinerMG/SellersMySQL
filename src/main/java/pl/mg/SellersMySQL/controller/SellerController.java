package pl.mg.SellersMySQL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.mg.SellersMySQL.exception.ResourceNotFoundException;
import pl.mg.SellersMySQL.model.Seller;
import pl.mg.SellersMySQL.repository.SellerRepository;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/clients")
public class SellerController {

    @Autowired
    private SellerRepository sellerRepository;

    @GetMapping
    public List<Seller> getAllSellers() {
        return sellerRepository.findAll();
    }

    @PostMapping
    public Seller createSeller(@RequestBody Seller seller) {
        return sellerRepository.save(seller);
    }

    @GetMapping("{id}")
    public ResponseEntity<Seller> getSellerById(@PathVariable long id) {
        Seller seller = sellerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Campaign not exist with id: " + id));

        return ResponseEntity.ok(seller);
    }

    @PutMapping("{id}")
    public ResponseEntity<Seller> updateSeller(@PathVariable long id,@RequestBody Seller sellerDetails) {
        Seller updateSeller = sellerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Campaign not exist with id: " + id));

        updateSeller.setCamapaignName(sellerDetails.getCamapaignName());
        updateSeller.setKeywords(sellerDetails.getKeywords());
        updateSeller.setBidAmount(sellerDetails.getBidAmount());
        updateSeller.setCamapaignFund(sellerDetails.getCamapaignFund());
        updateSeller.setStatus(sellerDetails.getStatus());
        updateSeller.setTown(sellerDetails.getTown());
        updateSeller.setRadius(sellerDetails.getRadius());

        sellerRepository.save(updateSeller);

        return ResponseEntity.ok(updateSeller);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteSeller(@PathVariable long id) {

        Seller seller = sellerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Campaign not exist with id: " + id));

        sellerRepository.delete(seller);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
