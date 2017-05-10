package transjs

/** Contains methods for simple string wraps of JS Code.
  * @note Meant for building code recrusively
  */
object wrappers {
	/** Wraps a string argument(s) in console.log()
	  * @param args arbitrary number of strings
	  *
	  */
	def consoleLog(args:String*):String = s"console.log(${args.mkString(",")})";
	/** Wraps a string argument(s) in alert()
	  * @param args arbitrary number of strings
	  *
	  */
	def alert(args:String*):String = s"alert(${args.mkString(",")})";
	/** Wraps a string argument(s) in multi line comments
	  * @param args arbitrary number of strings
	  *
	  */
	def mLComment(args:String*):String = s"/*${args.mkString("\n")}*/";
	/** Wraps a string in comment syntax
	  * @param arg A string
	  *
	  */
	def comment(arg:String):String = s"//$arg"; 
	/** Wraps a string in string literal.
	  * @param arg A string
	  *
	  */
	def string(arg:String):String = s""""$arg"""";
	/** Wraps string(s) as statements in a function body
	  * @param args arbitrary number of strings
	  * @note uses newline to seperate statements
	  */
	def funcBody(args:String*):String = s"function(){${args.mkString("\n")}}";
	/** Wraps string(s) as statements in a function body
	  * @param args arbitrary number of strings
	  * @note semicolon to seperate statements
	  */
	def funcBodyS(args:String*):String = s"function(){${args.mkString(";")}}";
	/** Wraps string(s) as statements in a called function body
	  * @param args arbitrary number of strings
	  * @note uses newline to seperate statements
	  */
	def funcBodyCalled(args:String*):String = s"(function(){${args.mkString("\n")}})()";
	/** Wraps string(s) as infixed with the + operator
	  * @param args arbitrary number of strings
	  * @note no terminator at end of string.
	  */
	def add(args:String*) = args.mkString("+");
	/** Wraps string(s) as infixed with the - operator
	  * @param args arbitrary number of strings
	  * @note no terminator at end of string.
	  */
	def sub(args:String*) = args.mkString("-");
	/** Wraps string(s) as infixed with the * operator
	  * @param args arbitrary number of strings
	  * @note no terminator at end of string.
	  */
	def mul(args:String*) = args.mkString("*");
	/** Wraps string(s) as infixed with the / operator
	  * @param args arbitrary number of strings
	  * @note no terminator at end of string.
	  */
	def div(args:String*) = args.mkString("/");
	/** Wraps string(s) as infixed with the % operator
	  * @param args arbitrary number of strings
	  * @note no terminator at end of string.
	  */
	def rem(args:String*) = args.mkString("%");
	/** Wraps string(s) as infixed with the === operator
	  * @param args arbitrary number of strings
	  * @note no terminator at end of string.
	  */
	def eq(args:String*) = args.mkString("===");
	/** Wraps string(s) as infixed with the > operator
	  * @param args arbitrary number of strings
	  * @note no terminator at end of string.
	  */
	def gt(args:String*) = args.mkString(">");
	/** Wraps string(s) as infixed with the < operator
	  * @param args arbitrary number of strings
	  * @note no terminator at end of string.
	  */
	def lt(args:String*) = args.mkString("<");
	/** Wraps string(s) as infixed with the >= operator
	  * @param args arbitrary number of strings
	  * @note no terminator at end of string.
	  */
	def ge(args:String*) = args.mkString(">=");
	/** Wraps string(s) as infixed with the <= operator
	  * @param args arbitrary number of strings
	  * @note no terminator at end of string.
	  */
	def le(args:String*) = args.mkString("<=");
	/** Wraps string(s) as infixed with the && operator
	  * @param args arbitrary number of strings
	  * @note no terminator at end of string.
	  */
	def and(args:String*) = args.mkString("&&");
	/** Wraps string(s) as infixed with the || operator
	  * @param args arbitrary number of strings
	  * @note no terminator at end of string.
	  */
	def or(args:String*) = args.mkString("||");
	/** Wraps three strings to form the ternary JS operator
	  * @param cond a string representing a conditon
	  * @param t statement to execute if true.
	  * @param f statement to execute if false.
	  */
	def tern(cond:String, t:String, f:String):String = s"$cond?$t:$f";
	/** Wraps one string and an arbitrary number of strings as a while loop.
	  * @param cond a string representing a conditon
	  * @param body a series of strings representing statements
	  */
	def _while(cond:String, body:String*):String = s"while($cond){${body.mkString("\n")}}";
	/** Wraps 4 or more strings to create a JS for loop
	  * @param cond a string representing a conditon
	  * @param init a string for initialization
	  * @param step progressive step in JS for loop
	  * @param body a series of strings representing statements
	  */
	def _for(init:String, cond:String, step:String, body:String*):String = s"for($init;$cond;$step){${body.mkString("\n")}}";
	/** Wraps a string and arguments in functon call syntax name(args)
	  *
	  */
	def call(funcname:String, args:String*):String = s"$funcname(${args.mkString(",")})";
	/** Wraps one string and an arbitrary number of strings as an if statement.
	  * @param cond a string representing a conditon
	  * @param body a series of strings representing statements
	  */
	def _if(cond:String, body:String*):String = s"if($cond){${body.mkString("\n")}}";
	/** Wraps one string and an arbitrary number of strings as an else statement.
	  * @param body a series of strings representing statements
	  */
	def _else(body:String*):String = s"else{${body.mkString("\n")}}";
	/** Wraps one string and an arbitrary number of strings as an elseif statement.
	  * @param cond a string representing a conditon
	  * @param body a series of strings representing statements
	  */
	def elseif(cond:String, body:String*):String = s"else if($cond){${body.mkString("\n")}}";
	/** Wraps one string and an arbitrary number of strings as a return statement
	  * @param arg a string representing any argument
	  */
	def _return(arg:String):String = s"return $arg";
	/** Wraps one string and an arbitrary number of strings as a template string.
	  * @param arg a string representing any argument
	  */
	def tempString(arg:String):String = s"`$arg`";
}