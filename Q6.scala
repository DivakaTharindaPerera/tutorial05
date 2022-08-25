import scala.io.StdIn.readInt

def fibo(n:Int):Int=n match{
    case x if x==0 =>0
    case x if x==1 =>1
    case x => fibo(n-1)+fibo(n-2)
}

def fiboseq(n:Int):Unit={
    if (n>0) fiboseq(n-1)
    println(fibo(n))
}

def main(args: Array[String])={
    fiboseq(10)
}