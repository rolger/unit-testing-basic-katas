import {Customer} from "./customer";

describe('Class: Customer', () => {
    let customer: Customer;

    beforeEach(() => {
        customer = (<any>Object).assign(new Customer(), {
            firstName: 'Dagobert',
            surName: 'Duck',
            birthday: new Date(1947, 12, 24)
        });
    });

    describe('fullName()', () => {
        it('should contain firstname and surname', () => {
            // TODO should start with first name
            fail("FIXME");

            // TODO should end with last name
            fail("FIXME");
        });
    });

    describe('email()', () => {
        it('should contain firstname, surname and eMail server', () => {
            // TODO should contain following strings: Donald, Duck, mybank.com
            fail("FIXME");
        });
    });

});