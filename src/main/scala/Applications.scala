import org.apache.log4j.Logger

object Applications extends App {
  val perform = new Operations
  val log = Logger.getLogger(this.getClass)
  val input1 = 5
  val input2 = 7
  log.info(s"$input1 + $input2 = ${perform.sumType("INts",input1,input2)} \n")
  log.info(s"square of $input1 + square of $input2 = ${perform.sumType("sqUaRe",input1,input2)} \n")
  log.info(s"cube of $input1 + cube of $input2 = ${perform.sumType("CUBE",input1,input2)} \n")
  val input = List(3,4,5,6,2)
  log.info(s"Sum of List ${input.toString()} is ${perform.sumOfList(input)} \n")
  log.info(s"Product of List ${input.toString()} is ${perform.productOfList(input)} \n")
  log.info(s"Max of List ${input.toString()} is ${perform.getMax(input)}")


}