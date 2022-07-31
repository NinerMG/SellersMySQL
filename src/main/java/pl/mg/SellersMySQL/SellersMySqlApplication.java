package pl.mg.SellersMySQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.mg.SellersMySQL.model.Seller;
import pl.mg.SellersMySQL.repository.SellerRepository;

@SpringBootApplication
public class SellersMySqlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SellersMySqlApplication.class, args);
	}

	@Autowired
	private SellerRepository sellerRepository;

	@Override
	public void run(String... args) throws Exception {
	//	Seller seller = new Seller();
	//	seller.setFundator("Elon Musk");
	//	seller.setCamapaignName("Solar City");
	//	seller.setKeywords("Solar, Energy");
	//	seller.setBidAmount(1000);
	//	seller.setCamapaignFund(5000);
	//	seller.setStatus("On");
	//	seller.setTown("Cracow");
	//	seller.setRadius(50);
	//	sellerRepository.save(seller);
	}
}
