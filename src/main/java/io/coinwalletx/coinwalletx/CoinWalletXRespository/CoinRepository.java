package io.coinwalletx.coinwalletx.CoinWalletXRespository;

import io.coinwalletx.coinwalletx.CoinWalletXModel.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<Coin, Long> {
}
