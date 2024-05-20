var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
// inheritance : multi level inheritance
var Student = /** @class */ (function () {
    function Student() {
        this.sname = "";
        this.course = "";
    }
    Student.prototype.getstdData = function (sname, course) {
        this.sname = sname;
        this.course = course;
    };
    return Student;
}());
var Marks = /** @class */ (function (_super) {
    __extends(Marks, _super);
    function Marks() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.sub1 = 0;
        _this.sub2 = 0;
        return _this;
    }
    Marks.prototype.getMarks = function (s1, s2) {
        this.sub1 = s1;
        this.sub2 = s2;
    };
    return Marks;
}(Student));
var Results = /** @class */ (function (_super) {
    __extends(Results, _super);
    function Results() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Results.prototype.printStdInfo = function () {
        console.log("Student Name : " + this.sname);
        console.log("Student Course : " + this.course);
        console.log("Subject 1 marks : " + this.sub1);
        console.log("Subject 2 marks : " + this.sub2);
        console.log("Total marks : " + (this.sub1 + this.sub2));
    };
    return Results;
}(Marks));
var res = new Results();
res.getstdData("Kiran", "java");
res.getMarks(67, 78);
res.printStdInfo();
