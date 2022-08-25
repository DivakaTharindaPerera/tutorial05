def iseven(n:Int):Boolean= n match{
    case 0 => true
    case _ => isodd(n-1)
}

def isodd(n:Int):Boolean = !(iseven(n))

def main(args: Array[String])={
    println(iseven(5))
}