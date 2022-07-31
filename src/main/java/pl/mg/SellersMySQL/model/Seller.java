package pl.mg.SellersMySQL.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clients")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fundator")
    private String fundator;

    @Column(name = "campaign_name")
    private String camapaignName;

    @Column(name = "keywords")
    private String keywords;

    @Column(name = "bid_amount")
    private int bidAmount;

    @Column(name = "campaign_fund")
    private int camapaignFund;

    @Column(name = "status")
    private String status;

    @Column(name = "town")
    private String town;

    @Column(name = "radius")
    private int radius;
}
