package com

object Filter {
  
  def courseMatch(course : String) : String = course match {
    case "1" => "Android course Price is : 12999"
    case "2" => "Big data development course Price is : 17999"
    case "3" => "Spark course Price is : 19999"
    case _ =>  "Entered course option is not available at Acadgild"
  }
 
  
  def main(args: Array[String]) : Unit = {
    
    println("Courses Available at Acadgild are : ");
    println("1 - Android");
    println("2 - Big Data Development");
    println("3 - Spark");
    print("Enter the Corresponding course no. : ");
    var course = readLine().toString.toLowerCase 
    println(courseMatch(course));
    
  }
}
