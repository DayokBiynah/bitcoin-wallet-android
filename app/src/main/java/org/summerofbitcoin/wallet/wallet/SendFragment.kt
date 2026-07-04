/*
 * Copyright 2021 thunderbiscuit and contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the ./LICENSE file.
 */

package org.summerofbitcoin.wallet.wallet

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import org.summerofbitcoin.wallet.R
import org.summerofbitcoin.wallet.databinding.FragmentSendBinding
import org.summerofbitcoin.wallet.utilities.SnackbarLevel
import org.summerofbitcoin.wallet.utilities.showSnackbar

class SendFragment : Fragment() {

    private lateinit var binding: FragmentSendBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSendBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        binding.sendToWalletButton.setOnClickListener {
            navController.navigate(R.id.action_sendFragment_to_walletFragment)
        }

        binding.toBroadcastConfirmation.setOnClickListener {
            MaterialAlertDialogBuilder(
                requireContext(),
                R.style.NordDialogTheme
            )
                .setTitle("Confirm transaction")
                .setMessage(buildConfirmTransactionMessage())
                .setPositiveButton("Broadcast") { _, _ ->
                    Log.i("SobiWallet", "Broadcast disabled in portfolio version")
                    broadcastTransaction()
                    navController.navigate(R.id.action_sendFragment_to_walletFragment)
                }
                .setNegativeButton("Go back", null)
                .show()
        }
    }

    private fun buildConfirmTransactionMessage(): String {
        val sendToAddress = binding.sendToAddress.text.toString().trim()
        val sendAmount = binding.sendAmount.text.toString().trim()

        return """
            Send to:
            $sendToAddress

            Amount:
            $sendAmount satoshis
        """.trimIndent()
    }

    private fun broadcastTransaction() {
        showSnackbar(
            requireView(),
            SnackbarLevel.ERROR,
            "Bitcoin sending is disabled in this portfolio demo."
        )
    }
}