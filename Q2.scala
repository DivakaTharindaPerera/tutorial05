object q2 extends App{
    def GCD(x:Int,y:Int):Int=y match{
        case 0 => x
        case a if a>x => GCD(a,x)
        case _=> GCD(a,x%a)
    }

    def isprime(p:Int,n:Int=2):Boolean = n match{
        case x if (x==p) => true
        case x if GCD(p,x) > 1 =>false
        case x => isprime(p,x+1)
    }


    def list(n:Int):Unit={
        if (n>1){
            list(n-1)
        }
        if(isprime(n)){
            return n
        }
    }

    def main(args:Array[String])={
        println(list(10))
    }
}