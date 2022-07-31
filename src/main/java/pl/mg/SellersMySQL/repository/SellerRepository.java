package pl.mg.SellersMySQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mg.SellersMySQL.model.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
