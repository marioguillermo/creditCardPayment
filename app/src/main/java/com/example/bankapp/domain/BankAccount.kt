package com.example.bankapp.domain

data class BankAccount(
    val closingDateBalance: Double,
    val currentDebt: Double,
    val cardName: String,
    val cardNumber: String,
    val minimumPaymentDue: Double,
    val paymentDue: Double,
    val paymentDueDate: String,
    val accountBalance: Double,
    val accountName: String,
    val accountNumber: String
)
