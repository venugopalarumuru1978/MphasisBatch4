var DemoClass = /** @class */ (function () {
    function DemoClass() {
        this.x = 0;
        this.y = 0;
    }
    DemoClass.prototype.getdata = function () {
        this.x = 10;
        this.y = 20;
    };
    DemoClass.prototype.putdata = function () {
        console.log("X val : " + this.x);
        console.log("Y val : " + this.y);
        var sum = this.x + this.y;
        console.log("Sum Value : " + sum);
    };
    return DemoClass;
}());
var dc1 = new DemoClass();
dc1.getdata();
dc1.putdata();
