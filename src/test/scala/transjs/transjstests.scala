package transjs

import org.scalatest._

class ConsoleTest extends FlatSpec with Matchers {
  "The consoleLog" should "Wrap a string in console.log" in {
    transjs.wrappers.consoleLog("3", "4") shouldEqual "console.log(3,4)"
  }
}

class StringTest extends FlatSpec with Matchers {
  "The string wrapper" should "Wrap a string in double quotes" in {
    transjs.wrappers.string("a") shouldEqual """"a""""
  }
}

class CallTest extends FlatSpec with Matchers {
  "The call wrapper" should "Wrap a name and args for function call" in {
    transjs.wrappers.call("a", "2", "4") shouldEqual "a(2,4)"
  }
}

class IfTest extends FlatSpec with Matchers {
  "The if wrapper" should "Wrap a cond and body for if statement" in {
    transjs.wrappers._if("a===b", "console.log(8)", "return 3") shouldEqual "if(a===b){console.log(8)\nreturn 3}"
  }
}
