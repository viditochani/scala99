object P20{
    def removeAt[A](n: Int, list: List[A]): (List[A], A) = 
       (((list take n) ::: (list drop n+1)), list.lift(n).getOrElse(throw new NoSuchElementException)) 
}

