import {Money} from './money';
import {Account} from './account';

export interface AccountReport {
    balance: Money;
    owner: string;
    sumOfWithdrawals: number;
    sumOfDeposits: number;
    lastTransactionDay: Date;
}

export function createAccountReport(account: Account): AccountReport {
    return {
        balance: account.balance,
        lastTransactionDay: account.lastTransactionDate,
        owner: account.owner.fullName(),
        sumOfWithdrawals: account.getTransactions()
            .filter(t => t.amount.getValue() < 0)
            .reduce((a, b) => a.add(b.amount), new Money(0))
            .getValue(),
        sumOfDeposits: account.getTransactions()
            .filter(t => t.amount.getValue() > 0)
            .reduce((a, b) => a.add(b.amount), new Money(0))
            .getValue()
    } as AccountReport;
}