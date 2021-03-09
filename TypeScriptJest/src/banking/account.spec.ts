import {Customer} from "./customer";
import {Account} from "./account";
import {Money} from "./money";

// Jest expectations: https://jestjs.io/docs/en/expect
describe('Class: Account', () => {
    let account: Account;

    function dagobertDuck() {
        return (<any>Object).assign(new Customer(), {
            firstName: 'Dagobert',
            surName: 'Duck',
            birthday: new Date(1947, 12, 24)
        });
    }

    beforeEach(() => {
        account = new Account(dagobertDuck());
    });

    describe('deposit()', () => {
        it('should increase the balance by amount', () => {
            account.deposit(new Money(1000000));

            fail("FIXME");
        });

        it('should throw an exception if amount is less then 0', () => {
            fail("FIXME");
        });
    });

    describe('withdraw()', () => {
        it('should throw an exception if amount is less then 0', () => {
            fail("FIXME");
        });

        it('should throw an exception if amount is more then limit', () => {
            fail("FIXME");
        });
    });

    describe('getTransactions()', () => {
        it('should order transactions correctly by amount', () => {
            account.deposit(new Money(1000000));
            account.withdraw(new Money(145));
            account.deposit(new Money(150));

            fail("FIXME");
        });
    });

});
