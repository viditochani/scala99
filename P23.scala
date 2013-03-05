object P23 {
  import P20.removeAt
  def randomSelect[A](n: Int, list: List[A]) = {
    def randomSelectIter(n: Int, list2: List[A], r: util.Random): List[A] = 
      if(n<=0) List()
      else {
        val newList = removeAt(r.nextInt(list2.length), list2)
        newList._2 :: randomSelectIter(n-1, newList._1, r)
      }
    randomSelectIter(n, list, new util.Random)
  }
}
