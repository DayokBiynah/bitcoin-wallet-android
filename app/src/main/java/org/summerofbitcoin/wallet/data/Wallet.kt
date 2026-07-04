package org.summerofbitcoin.wallet.data

object Wallet {
    fun setPath(path: String) {}

    fun createWallet() {}

    fun loadExistingWallet() {}

    fun recoverWallet(mnemonic: String) {}

    fun sync(max_address: Int = 100) {}

    fun getNewAddress(): String {
        return "tb1qexampletestnetaddress000000000000000000000"
    }

    fun getBalance(): Long {
        return 0L
    }

    fun listTransactions(): List<String> {
        return emptyList()
    }
}