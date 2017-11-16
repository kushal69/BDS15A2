package com

object PartialMultiple {
  def sum(n1: Int, n2: Int, n3: Int): Int = n1 + n2 + n3;
  def partsum = sum(4, _: Int, _: Int);
  def sqrNum(f: (Int, Int) => Int): Unit = {
    val ans = f(2, 3);
    println("Some of sum of three number is : " + ans);
    println("Some of sum of Square number is : " + ans * ans);
  }

  def main(args: Array[String]): Unit = {
    sqrNum(partsum);
  }
}
