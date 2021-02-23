package com.example.bankapp.data

import com.example.bankapp.domain.BankAccount

class AccountRepository {

    fun getAccount(): BankAccount {
        return BankAccount(
            5600.0,
            5600.0,
            "ORO BBVA",
            "*4323",
            546.65,
            4700.0,
            "28 feb 2021",
            5000.0,
            "Cuenta de ahorro",
            "*3294"
        )
    }

}