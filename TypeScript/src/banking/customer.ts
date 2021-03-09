import {Adress} from "./adress";

export class Customer {
    firstName: string;
    surName: string;
    birthday: Date;
    adress: Adress;

    fullName(): string {
        return `${this.firstName.toLowerCase()} ${this.surName}`;
    }

    email(): string {
        return this.firstName.toLowerCase() + "." + this.surName.toLowerCase() + "@mybank.com";
    }

}