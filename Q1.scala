def GCD(a:Int,b:Int):Int=a match{
    case 0 => b
    case _=> GCD (b%a,a)
}

def isprime(p:Int,a:Int=2):Boolean=a match{
    case x if(x==p)=> true
    case x if GCD(p,x)>1 =>false
    case x => isprime(p,x+1)
}

def main(args: Array[String])={
    println(isprime(5))
    println(isprime(8))
}