class DemoCons
{
    private x:number =0;
    private y:number = 0;

    constructor(x:number, y:number)
    {
        this.x = x;
        this.y = y;

        console.log("It is a constructor");
    }

    printdata():void 
    {
        console.log("X value is : " + this.x);
        console.log("Y value is : " + this.y);
    }

}

var obj1 = new DemoCons(56,67);
obj1.printdata();
