import {Transaction} from "./transaction";
import {Money} from "./money";
import {Customer} from "./customer";


export class Account {
    balance: Money;
    lastTransactionDate: Date;
    transactions: Transaction[];
    owner: Customer;

    constructor(owner: Customer) {
        this.owner = owner;
        this.balance = new Money(0);
        this.transactions = [];
    }

    getTransactions(): Transaction[] {
        return this.transactions.sort((a, b) => {
            return a.amount.getValue() - b.amount.getValue();
        });
    }

    deposit(amount: Money): void {
        if (0 >= amount.getValue()) {
            throw new Error("Amount less than minimum amount of 0.00");
        }

        this.balance = this.balance.add(amount);
        this.lastTransactionDate = new Date();
        this.transactions.push({
            amount: amount,
            transactionDate: this.lastTransactionDate
        });
    }

    withdraw(amount: Money): void {
        if (0 >= amount.getValue()) {
            throw new TypeError("Amount less than minimum amount of 0.00");
        }

        if (1000 < amount.getValue()) {
            throw new TypeError("Amount more than maximum amount of 1000.00");
        }

        this.balance = this.balance.add(new Money(amount.getValue() * -1));
        this.lastTransactionDate = new Date();
        this.transactions.push({
            amount: new Money(amount.getValue() * -1),
            transactionDate: this.lastTransactionDate
        });
    }
}