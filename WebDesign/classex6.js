"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var empinfo_1 = require("./empinfo");
var EmpsInfo = /** @class */ (function () {
    function EmpsInfo() {
        this.emp = [
            new empinfo_1.Employee(1001, "Pavan"),
            new empinfo_1.Employee(1002, "Karan"),
            new empinfo_1.Employee(1003, "Murali"),
            new empinfo_1.Employee(1004, "Kamal"),
            new empinfo_1.Employee(1005, "Mohan")
        ];
    }
    EmpsInfo.prototype.printempinfo = function () {
        for (var i = 0; i < this.emp.length; i++) {
            console.log(this.emp[i].eno + "<===>" + this.emp[i].ename);
        }
    };
    return EmpsInfo;
}());
var eobj = new EmpsInfo();
eobj.printempinfo();
