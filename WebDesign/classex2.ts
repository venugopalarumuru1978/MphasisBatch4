class TestClass
{
   private x:number=0;
   private y:number=0;

    public getdata(x:number, y:number):void
    {
        this.x = x;
        this.y = y;
    }

    public putdata():number
    {
        console.log("X val : " + this.x);
        console.log("Y val : " + this.y);
        var sum = this.x + this.y;
        return sum;
    } 
}

var d1 = new TestClass();
d1.getdata(10,20);
console.log("Sum Value is : " + d1.putdata());
