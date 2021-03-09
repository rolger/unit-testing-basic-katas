import { createAccountReport } from "./account-report";
import { Account } from "./account";
import { Customer } from "./customer";
import { Money } from "./money";

describe('Service: createAccountReport', () => {
    let account: Account;

    beforeEach(() => {
        let dagobertDuck = (<any>Object).assign(new Customer(), {
            firstName: 'Dagobert',
            surName: 'Duck',
            birthday: new Date(1947, 12, 24)
        });

        account = new Account(dagobertDuck);
    });

    // https://jestjs.io/docs/en/expect#tomatchobjectobject
    it('should contain the sum of all deposit transactions, sum of withdrawals and sum of deposits', () => {
        account.deposit(new Money(80.7));
        account.withdraw(new Money(7.15));

        let report = createAccountReport(account);

        fail("FIXME");
    });


    // https://jestjs.io/docs/en/jest-object#jestsetsystemtimenow-number--date
    it('should create a full report', () => {
        // TODO: handle the transaction date

        account.deposit(new Money(80.7));
        account.withdraw(new Money(7.15));

        let report = createAccountReport(account);

        fail("FIXME");
    });

});
