var TestClass = /** @class */ (function () {
    function TestClass() {
        this.x = 0;
        this.y = 0;
    }
    TestClass.prototype.getdata = function (x, y) {
        this.x = x;
        this.y = y;
    };
    TestClass.prototype.putdata = function () {
        console.log("X val : " + this.x);
        console.log("Y val : " + this.y);
        var sum = this.x + this.y;
        return sum;
    };
    return TestClass;
}());
var dc1 = new TestClass();
dc1.getdata(10, 20);
console.log("Sum Value is : " + dc1.putdata());
