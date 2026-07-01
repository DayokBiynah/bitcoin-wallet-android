package org.summerofbitcoin.wallet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class WalletChoiceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(Intent(this, WalletActivity::class.java))
        finish()
    }
}