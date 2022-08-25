import scala.io.StdIn.readInt
def iseven(a:Int):Boolean=a match{
    case x if (x%2==0) => true
    case _ => false
}

def sum(n:Int,tot:Int=0):Int=n match{
    case x if (iseven(x) && x!=0) => sum(x-1,tot+x)
    case x if (x!=0) => sum(x-1,tot)
    case _ => tot
}

def main(args: Array[String])={
    var n = readInt()
    println(sum(n))
}