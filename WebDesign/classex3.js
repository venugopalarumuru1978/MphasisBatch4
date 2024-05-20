var DemoCons = /** @class */ (function () {
    function DemoCons(x, y) {
        this.x = 0;
        this.y = 0;
        this.x = x;
        this.y = y;
        console.log("It is a constructor");
    }
    DemoCons.prototype.printdata = function () {
        console.log("X value is : " + this.x);
        console.log("Y value is : " + this.y);
    };
    return DemoCons;
}());
var obj1 = new DemoCons(56, 67);
obj1.printdata();
