class DemoClass
{
   private x:number=0;
   private y:number=0;

    public getdata():void
    {
        this.x = 10;
        this.y = 20;
    }

    public putdata():void
    {
        console.log("X val : " + this.x);
        console.log("Y val : " + this.y);
        var sum = this.x + this.y;
        console.log("Sum Value : " + sum);
    } 
}

var dc1 = new DemoClass();
dc1.getdata();
dc1.putdata();
