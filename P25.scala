object P25 {
  import P23.randomSelect
  def randomPermute[A](list: List[A]): List[A] = 
    randomSelect(list.length, list)
}
