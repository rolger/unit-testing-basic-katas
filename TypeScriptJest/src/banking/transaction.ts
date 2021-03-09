import {Money} from "./money";

export interface Transaction {
    amount: Money;
    transactionDate: Date;
}