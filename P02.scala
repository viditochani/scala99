object P02 {
    def penultimate[A](list: List[A]): A = 
        list.init.last
}
