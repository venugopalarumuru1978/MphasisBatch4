// enumerations

enum Course{
    Java, Angular, React, Python, SQL, Dotnet
}
 
class StudentCourse
{
    private sname:string;
    private cname:Course;

    getstdinfo():void
    {
        this.sname = "Praveen Kumar";
        this.cname = Course.Java;  // here it will assign only index number
    }

    printdata():void
    {
        console.log("Student Name : " + this.sname);
        console.log("Course Name : " + Course[this.cname]); // here it returns a value
    }
}

var sc = new StudentCourse();
sc.getstdinfo();
sc.printdata();