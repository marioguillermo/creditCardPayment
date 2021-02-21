package com.example.bankapp.domain

data class BankAccount(
    val debt: Double,
    val deferred: Double,
    val creditLine: Double,
    val minPayment: Double,
    val paymentAmount: Double,
    val currentBalance: Double
)