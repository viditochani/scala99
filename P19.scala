object P19 {
    def rotate[A](n: Int, list: List[A]): List[A]= 
        if(n<0) ((list.takeRight(-n)) ::: (list.dropRight(-n))) 
        else ((list drop n) ::: (list take n))
}
