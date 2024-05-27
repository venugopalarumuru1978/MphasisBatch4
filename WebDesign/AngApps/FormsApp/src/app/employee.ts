export class Employee {

    id:number=0;
    ename:string = "";
    job:string = "";
    salary:number = 0.0;

    constructor(id:number, ename:string, job:string, sal:number){
        this.id = id;
        this.ename = ename;
        this.job = job;
        this.salary = sal;
    }
}
