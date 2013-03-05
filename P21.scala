object P21{ 
    def insertAt[A](a: A, n: Int, list: List[A]): List[A]= 
        ((list take n) :+ a)  ::: (list drop n)
}
