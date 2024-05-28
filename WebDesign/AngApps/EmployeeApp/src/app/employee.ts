export class Employee {
    id:number=0;
    firstName:string = "";
    lastName:string = "";
    emailId:string = "";

    constructor(id:number, fname:string, lname:string, email:string)
    {
        this.id = id;
        this.firstName = fname;
        this.lastName = lname;
        this.emailId = email;
    }
}
