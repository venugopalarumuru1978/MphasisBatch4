var Sample = /** @class */ (function () {
    function Sample() {
        this.x = 0;
    }
    Sample.prototype.getdata = function (x) {
        this.x = x;
    };
    Sample.prototype.sqare = function () {
        var sq = this.x * this.x;
        return sq;
    };
    Sample.prototype.cube = function () {
        var cb = this.x * this.x * this.x;
        return cb;
    };
    return Sample;
}());
var sam = new Sample();
sam.getdata(10);
console.log("Square Value is : " + sam.sqare());
console.log("Cube Value is : " + sam.cube());
