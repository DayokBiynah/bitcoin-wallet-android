<div align="center">

# ₿ Android Bitcoin Wallet

*A modern Android Bitcoin wallet built with Kotlin, Jetpack, and the Bitcoin Development Kit (BDK) architecture.*

![Kotlin](https://img.shields.io/badge/Kotlin-100%25-blue)
![Android](https://img.shields.io/badge/Platform-Android-green)
![Bitcoin](https://img.shields.io/badge/Bitcoin-Testnet-orange)
![License](https://img.shields.io/badge/License-Apache--2.0-lightgrey)

</div>

---

# Overview

This project is an Android Bitcoin wallet inspired by the Summer of Bitcoin open-source wallet initiative. It demonstrates the architecture and user experience behind modern self-custodial cryptocurrency wallets while leveraging contemporary Android development practices.

The application provides a clean interface for wallet creation, recovery, transaction management, and Bitcoin wallet operations on the Bitcoin Testnet.

The project is structured around the Bitcoin Development Kit (BDK) architecture, illustrating how native Bitcoin functionality can be integrated into Android applications through modular wallet management and blockchain interaction.

---

# Features

- Bitcoin wallet creation
- Wallet recovery workflow
- Transaction history interface
- Send Bitcoin interface
- Receive Bitcoin interface
- Wallet navigation using Jetpack Navigation
- Fragment-based architecture
- Material Design UI
- View Binding
- Modular Android architecture
- Testnet wallet workflow

---

# Technologies

### Mobile Development

- Kotlin
- Android Studio
- Android SDK
- XML Layouts
- Jetpack Navigation Component
- View Binding
- Material Design Components
- Gradle

### Bitcoin & Web3

- Bitcoin Development Kit (BDK) architecture
- Bitcoin Testnet
- HD Wallet concepts (BIP-32 / BIP-39 / BIP-84)
- Descriptor-based wallet architecture
- Bitcoin address generation concepts
- PSBT (Partially Signed Bitcoin Transactions) workflow
- Self-custodial wallet architecture

---

# Architecture

The application follows a modular Android architecture separating the wallet engine, navigation layer, user interface, and persistent storage.

```
UI
│
├── Wallet Dashboard
├── Send Bitcoin
├── Receive Bitcoin
├── Transaction History
└── Wallet Recovery

        │

Navigation Component

        │

Wallet Layer

        │

Repository Layer

        │

Bitcoin Development Kit (BDK)
```

---

# Project Structure

```
app/
├── data/
│   ├── Repository
│   └── Wallet
│
├── wallet/
│   ├── WalletFragment
│   ├── SendFragment
│   ├── ReceiveFragment
│   ├── TransactionsFragment
│   └── WalletActivity
│
├── utilities/
├── navigation/
└── resources/
```

---

# Skills Demonstrated

- Android application development
- Mobile UI/UX implementation
- Fragment lifecycle management
- Navigation Component
- State management
- Android resource management
- Bitcoin wallet architecture
- Repository design pattern
- Gradle dependency management
- Open-source software integration
- Legacy project modernization
- Debugging dependency compatibility issues

---

# Future Improvements

- Upgrade to the latest Bitcoin Development Kit (BDK)
- Full Bitcoin transaction signing
- QR code scanning
- Wallet encryption
- Secure key storage
- Biometric authentication
- Multi-wallet support
- Mainnet/Testnet switching
- Lightning Network integration

---

# Acknowledgements

This project was developed by adapting and modernizing the Summer of Bitcoin Android Wallet open-source project for current Android tooling while preserving the underlying wallet architecture and educational objectives.

Original inspiration:

https://github.com/thunderbiscuit/summerofbitcoin-wallet
