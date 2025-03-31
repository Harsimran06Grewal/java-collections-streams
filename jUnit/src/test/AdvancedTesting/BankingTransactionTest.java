package AdvancedTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankingTransactionTest {
    // Create an instance of BankingTransaction for testing
    BankingTransaction bank = new BankingTransaction();


    @Test
    void deposit() {
        bank.deposit(1000); // Deposit 1000
        assertEquals(1000, bank.getBalance()); // Check if balance is updated correctly
    }

    @Test
    void withdraw() {
        bank.deposit(500);  // Deposit 500
        bank.withdraw(200);  // Withdraw 200
        assertEquals(300, bank.getBalance()); // Verify balance is 300 after withdrawal
    }

    @Test
    void insufficientFunds() {
        bank.deposit(500); // Deposit 500
        assertFalse(bank.withdraw(600.0)); // Attempt to withdraw 600 (should fail)
    }
}
