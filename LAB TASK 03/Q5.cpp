#include <iostream>
#include <string>
using namespace std;
class BankAccount {
private:
    string accountNumber;
    double balance;
public:
    BankAccount(string accountNum, double initialBalance) : accountNumber(accountNum), balance(initialBalance) {}
    double getBalance() const {
        return balance;
    }
void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
        cout << "Deposited " << amount << ". New balance: " << balance << endl;
        } else {
        cout << "Deposit amount must be greater than 0." << endl;
        }
    }
void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        cout << "Withdrew " << amount << ". New balance: " << balance << endl;
        } else if (amount > balance) {
        cout << "Insufficient funds for withdrawal." << endl;
        } else {
        cout << "Withdrawal amount must be greater than 0." << endl;
        }
    }
};

int main() {
BankAccount account("123456789", 500.0);
cout << "Initial balance: " << account.getBalance() << endl;
cout << "Attempting to deposit -100..." << endl;
account.deposit(-100);
cout << "Depositing 200..." << endl;
account.deposit(200);
cout << "Attempting to withdraw 800..." << endl;
account.withdraw(800);
cout << "Withdrawing 150..." << endl;
account.withdraw(150);
cout << "Attempting to withdraw -50..." << endl;
account.withdraw(-50);
cout << "Final balance: " << account.getBalance() << endl;
    return 0;
}
