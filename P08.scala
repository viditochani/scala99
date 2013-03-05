object P08 {
    def compress[A](list: List[A]): List[A] = {
        def compressIter(elem: A, list: List[A]): List[A] = 
            if(list.isEmpty) List()
            else if(elem == list.head) compressIter(elem, list.tail)
            else list.head :: compressIter(elem, list.tail)
        if(list.isEmpty)
        else list.head :: compressIter(list.head, list.tail)
    }
    
}
