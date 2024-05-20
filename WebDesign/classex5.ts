// Interface example
interface iface1
{
    getdata(x:number):void;
}

interface iface2
{
    sqare():number;
    cube():number;
}

class Sample implements iface1, iface2
{
    private x:number = 0;
    getdata(x:number):void{
this.x = x;
    }

    sqare():number{
     var sq = this.x*this.x;
        return sq;
    }
    cube():number{
var cb = this.x*this.x*this.x;
        return cb;
    }

}

var sam = new Sample();
sam.getdata(10);
console.log("Square Value is : " + sam.sqare());
console.log("Cube Value is : " + sam.cube());
