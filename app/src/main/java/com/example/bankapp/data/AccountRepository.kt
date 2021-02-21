package com.example.bankapp.data

import com.example.bankapp.domain.BankAccount

class AccountRepository {

    fun getAccount(): BankAccount {
        return BankAccount(
            7000.00,
            2300.0,
            20000.0,
            569.34,
            4700.0,
            5500.0
        )
    }

}