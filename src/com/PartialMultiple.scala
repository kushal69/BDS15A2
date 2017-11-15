package com

object PartialMultiple {
  def sum(a: Int, b: Int, c: Int): Int = a + b + c;
  def partsum = sum(4, _: Int, _: Int);
  def sqrNum(f: (Int, Int) => Int): Unit = {
    val ans = f(2, 3);
    println("Some of sum of three munber is : " + ans);
    println("Some of sum of Square munber is : " + ans * ans);
  }

  def main(args: Array[String]): Unit = {
    sqrNum(partsum);
  }
}