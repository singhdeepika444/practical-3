object datatype
{
	var byt: Byte=10
	var shrt: Short=2
	var integer: Int=1234
	var long: Long=34564
	var float: Float=121.234f
	var db: Double=65654.4545564
	var character: Char='S'
	var string: String="Deepika Singh"
	var bool: Boolean=true

	val nullAsVariable: String=null
	val nullAsDatatype: Null=null

	def logException(e:Exception):Nothing=
	{
		println("logging Exception: %s".format(e.getMessage))
		throw new Exception("My new Exception")
	}

	def anyRef(x: AnyRef)=println("AnyRef datatype: "+x)
	def any(y: Any)=println("Any datatype: "+y)

	def show(): Unit=
	{
		println("Byte datatye: "+byt)
		println("Short datatye: "+shrt)
		println("Integer datatye: "+integer)
		println("Long datatye: "+long)
		println("Float datatye: "+float)
		println("Double datatye: "+db)
		println("Char datatye: "+character)
		println("String datatye: "+string)
		println("Boolean datatype: "+bool)
	}
	def main(args: Array[String])
	{
		show();
		anyRef(nullAsDatatype)
		any(nullAsDatatype)
	}
}