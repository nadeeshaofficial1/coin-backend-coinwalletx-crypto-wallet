package io.coinwalletx.coinwalletx.CoinWalletXModel;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Coin {


    @Id
    @GeneratedValue
    private Long id;
    private String coinname;
    private String coinvolume;
    private String blockchainid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoinname() {
        return coinname;
    }

    public void setCoinname(String coinname) {
        this.coinname = coinname;
    }

    public String getCoinvolume() {
        return coinvolume;
    }

    public void setCoinvolume(String coinvolume) {
        this.coinvolume = coinvolume;
    }

    public String getBlockchainid() {
        return blockchainid;
    }

    public void setBlockchainid(String blockchainid) {
        this.blockchainid = blockchainid;
    }
}
