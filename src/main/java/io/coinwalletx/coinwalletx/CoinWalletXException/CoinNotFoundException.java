package io.coinwalletx.coinwalletx.CoinWalletXException;

public class CoinNotFoundException extends RuntimeException{
    public CoinNotFoundException(Long id){
        super("Could not found the coin with id "+ id);
    }
}
