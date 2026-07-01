package org.summerofbitcoin.wallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(Intent(this, WalletChoiceActivity::class.java))
        finish()
    }
}