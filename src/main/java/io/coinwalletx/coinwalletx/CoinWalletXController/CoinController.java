package io.coinwalletx.coinwalletx.CoinWalletXController;


import io.coinwalletx.coinwalletx.CoinWalletXException.CoinNotFoundException;
import io.coinwalletx.coinwalletx.CoinWalletXModel.Coin;
import io.coinwalletx.coinwalletx.CoinWalletXRespository.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class CoinController {

    @Autowired
    private CoinRepository coinRepository;

    @PostMapping("/coins")
    Coin newCoin(@RequestBody Coin newCoin){
        return coinRepository.save(newCoin);
    }
    @GetMapping("/allcoins")
    List<Coin> getAllCoins(){
        return coinRepository.findAll();
    }
    @GetMapping("/coins/{id}")
    Coin getCoinById(@PathVariable Long id){
        return coinRepository.findById(id)
                .orElseThrow(()->new CoinNotFoundException(id));
    }
    @PutMapping("/coins/{id}")
    Coin updateCoin(@RequestBody Coin newCoin,@PathVariable Long id){
        return coinRepository.findById(id)
                .map(coin -> {
                    coin.setCoinname(newCoin.getCoinname());
                    coin.setCoinvolume(newCoin.getCoinvolume());
                    coin.setBlockchainid(newCoin.getBlockchainid());
                    return coinRepository.save(coin);
                }).orElseThrow(()->new CoinNotFoundException(id));
    }
    @DeleteMapping("/coins/{id}")
    void deleteCoin(@PathVariable Long id){
        coinRepository.deleteById(id);
    }




}
