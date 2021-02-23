package com.example.bankapp.ui


import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.bankapp.R
import com.example.bankapp.data.AccountRepository
import com.example.bankapp.databinding.ActivityMainBinding
import com.example.bankapp.domain.BankAccount

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var bankAccount: BankAccount

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bankAccount = AccountRepository().getAccount()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bindAccountDataToViews(bankAccount)
    }

    private fun bindAccountDataToViews(
        bankAccount: BankAccount
    ) = with(binding.cardLayout) {
        tvAccountName.text = bankAccount.accountName
        //El string label_peso_sign pide un número, por eso el método getString recibe
        //un segundo parámetro, que en este caso es el accountBalance.
        tvAccountBalance.text = getString(R.string.label_peso_sign, bankAccount.accountBalance)
        tvAccountNumber.text = bankAccount.accountNumber
        tvCardName.text = bankAccount.cardName
        tvCardNumber.text = bankAccount.cardNumber
        tvCurrentDebtAmount.text = getString(R.string.label_peso_sign, bankAccount.currentDebt)
        tvClosingDateBalanceAmount.text =
            getString(R.string.label_peso_sign, bankAccount.closingDateBalance)
        tvPaymentDate.text = bankAccount.paymentDueDate
    }

    private fun showToastMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}