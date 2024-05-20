import { Employee } from "./empinfo";

class EmpsInfo
{
    // array of object creation
    private emp:Employee[] = [
        new Employee(1001, "Pavan"),
        new Employee(1002, "Karan"),
        new Employee(1003, "Murali"),
        new Employee(1004, "Kamal"),
        new Employee(1005, "Mohan")];

        printempinfo():void
        {
            for(let i=0;i<this.emp.length;i++)
              {
                console.log(this.emp[i].eno + "<===>" + this.emp[i].ename);
              } 
        }
}

var eobj = new EmpsInfo();
eobj.printempinfo();
