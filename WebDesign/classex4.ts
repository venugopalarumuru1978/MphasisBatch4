// inheritance : multi level inheritance
class Student
{
    protected sname:string  = "";
    protected course:string = "";

    getstdData(sname:string, course:string):void
    {
        this.sname = sname;
        this.course = course;
    }
}

class Marks extends Student
{
   protected sub1 : number = 0;
   protected sub2 : number = 0;
   
   getMarks(s1:number, s2:number) : void
   {
    this.sub1 = s1;
    this.sub2 = s2;
   }
}

class Results extends Marks
{
    printStdInfo():void
    {
        console.log("Student Name : " + this.sname);
        console.log("Student Course : " + this.course);
        console.log("Subject 1 marks : " + this.sub1);
        console.log("Subject 2 marks : " + this.sub2);
        console.log("Total marks : " + (this.sub1+this.sub2));
    }    
}

var res = new Results();
res.getstdData("Kiran", "java");
res.getMarks(67,78);
res.printStdInfo();