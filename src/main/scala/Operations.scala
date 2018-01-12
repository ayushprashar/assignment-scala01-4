class Operations {

  def sumCalculator(operationType: String,number1: Int,number2: Int,f:(String,Int,Int)=>Int): Int=
  {
    f(operationType,number1,number2)
  }

  def sumType(operationType: String,input1: Int,input2: Int): Int ={

    operationType.toLowerCase match {
      case "square" => sumCalculator(operationType,input1,input2,(_,num1,num2)=>num1*num1 + num2*num2)
      case "cube" => sumCalculator(operationType,input1,input2,(_, num1, num2)=>num1*num1*num1 + num2*num2*num2)
      case "ints" => sumCalculator(operationType,input1,input2,(_, num1, num2)=>num1 + num2)
      case _ => -1
    }
  }

  def performListOperation(inputList: List[Int],f:(List[Int])=>Int):Int={
    f(inputList)
  }

  def listOperations(mainList: List[Int],operationTypeOnList: String): Int ={
    operationTypeOnList.toLowerCase match {
      case "add" => performListOperation(mainList,sumOfList)
      case "multiply" => performListOperation(mainList,productOfList)
      case "max" => performListOperation(mainList,getMax)
      case _ => -1
    }
  }

  def sumOfList(domain: List[Int]):Int ={
    val sum = 0
    def breakAndAdd(inputList: List[Int],currentSum: Int):Int={
      inputList match{
        case head::Nil => head + currentSum
        case head::tail => breakAndAdd(tail,currentSum + head)
        case _ => -1
      }
    }
    breakAndAdd(domain,sum)
  }

  def productOfList(domain: List[Int]): Int ={
    val product = 1
    def breakAndMultiply(inputList: List[Int],currentProduct: Int):Int={
      inputList match {
        case head::Nil => head*currentProduct
        case head::tail => breakAndMultiply(tail,currentProduct*head)
        case _ => 0
      }
    }
    breakAndMultiply(domain,product)
  }
  def getMax(inputList: List[Int]): Int = {

    def findMax(domain: List[Int]): List[Int] = {
      domain match {
        case head :: Nil => {
          head :: Nil
        }
        case head1 :: head2 :: tail => {
          if (head1 > head2) {
            findMax(head1 :: tail)
          } else {
            findMax(head2 :: tail)
          }
        }
        case _ => List()
      }
    }
    findMax(inputList) match {
      case head::Nil => head
      case _ => -1
    }
  }

}
