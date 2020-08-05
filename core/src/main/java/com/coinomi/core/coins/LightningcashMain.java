package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class LightningcashMain extends BitFamily {
    private LightningcashMain() {
        id = "lightningcash.main";

        addressHeader = 28;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader };
        spendableCoinbaseDepth = 125;
        dumpedPrivateKeyHeader = 176;

        name = "LightningCash";
        symbol = "LNC";
        uriScheme = "lightningcash";
        bip44Index = 2;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 LTC mininput
        softDustLimit = value(100000); // 0.001 LTC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("LightningCash Signed Message:\n");
    }

    private static LightningcashMain instance = new LightningcashMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
