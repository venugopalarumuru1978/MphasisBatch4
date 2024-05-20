var Course;
(function (Course) {
    Course[Course["Java"] = 0] = "Java";
    Course[Course["Angular"] = 1] = "Angular";
    Course[Course["React"] = 2] = "React";
    Course[Course["Python"] = 3] = "Python";
    Course[Course["SQL"] = 4] = "SQL";
    Course[Course["Dotnet"] = 5] = "Dotnet";
})(Course || (Course = {}));
var StudentCourse = /** @class */ (function () {
    function StudentCourse() {
    }
    StudentCourse.prototype.getstdinfo = function () {
        this.sname = "Praveen Kumar";
        this.cname = Course.Angular;
    };
    StudentCourse.prototype.printdata = function () {
        console.log("Student Name : " + this.sname);
        console.log("Course Name : " + Course[this.cname]);
    };
    return StudentCourse;
}());
var sc = new StudentCourse();
sc.getstdinfo();
sc.printdata();
