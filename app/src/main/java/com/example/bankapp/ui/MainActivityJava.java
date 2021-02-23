package com.example.bankapp.ui;


import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bankapp.R;
import com.example.bankapp.data.AccountRepository;
import com.example.bankapp.databinding.ActivityMainBinding;
import com.example.bankapp.domain.BankAccount;

public class MainActivityJava extends AppCompatActivity {

    private ActivityMainBinding binding;
    private BankAccount bankAccount;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bankAccount = new AccountRepository().getAccount();
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        bindBankDataToViews(bankAccount);
    }

    private void bindBankDataToViews(BankAccount bankAccount) {
        binding.cardLayout.tvAccountName.setText(bankAccount.getAccountName());
        //El string label_peso_sign pide un número, por eso el método getString recibe
        //un segundo parámetro, que en este caso es el accountBalance.
        binding.cardLayout.tvAccountBalance.setText(getString(R.string.label_peso_sign, bankAccount.getAccountBalance()));
        binding.cardLayout.tvAccountNumber.setText(bankAccount.getAccountNumber());
        binding.cardLayout.tvCardName.setText(bankAccount.getCardName());
        binding.cardLayout.tvCardNumber.setText(bankAccount.getCardNumber());
        binding.cardLayout.tvCurrentDebtAmount.setText(getString(R.string.label_peso_sign, bankAccount.getCurrentDebt()));
        binding.cardLayout.tvClosingDateBalanceAmount.setText(getString(R.string.label_peso_sign, bankAccount.getClosingDateBalance()));
        binding.cardLayout.tvPaymentDate.setText(bankAccount.getPaymentDueDate());
    }

    private void showToastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}