object P16 {
    def drop[A](n: Int, list: List[A]) = 
        ((list zip (1 to list.length)) filter (_._2 % 3 !=0)) map (_._1)
}
