package transjs

/** Class for continously transpiling to javascript via a linear approach
  * @note made as case class to enable structural comparison and easier initialization.
  * @constructor Creates a new instance of JavaScript with an optional starting portion of code.
  * @param code a string of JS code
  */
case class JavaScript(var code:String = "") {
	/** Makes the JavaScript class easily printable
	  *
	  */
	override def toString(): String =  code;

	/** Creates a new JavaScript instance with the current code append with + arg
	  * @param arg a string of javascript code
	  * @example val f = JavaScript("4") + "3"
	  * 
	  */
	def +(arg:String):JavaScript = JavaScript(s"$code+$arg");
    /** - Operator extension
	  *
	  */
	def -(arg:String):JavaScript = JavaScript(s"$code-$arg");
    /** * Operator extension
	  *
	  */
	def *(arg:String):JavaScript = JavaScript(s"$code*$arg");
    /** / Operator extension
	  *
	  */
	def /(arg:String):JavaScript = JavaScript(s"$code/$arg");
	def %(arg:String):JavaScript = JavaScript(s"$code%$arg");
	def &&(arg:String):JavaScript = JavaScript(s"$code&&$arg");
	def ||(arg:String):JavaScript = JavaScript(s"$code||$arg");
	def >(arg:String):JavaScript = JavaScript(s"$code>$arg");
	def <(arg:String):JavaScript = JavaScript(s"$code<$arg");
	def >>(arg:String):JavaScript = JavaScript(s"$code>>$arg");
	def <<(arg:String):JavaScript = JavaScript(s"$code<<$arg");
	def _if(cond:String, body:String*) = JavaScript(s"$code\nif($cond){${body.mkString("\n")}}");
	def _while(cond:String, body:String*) = JavaScript(s"$code\nwhile($cond){${body.mkString("\n")}}");
}