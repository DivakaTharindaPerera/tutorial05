def sum(a:Int):Int=a match{
    case 0 => a
    case _ => a+sum(a-1)
}

def main(args: Array[String])={
    println(sum(5))
}