package blogito
import java.text.SimpleDateFormat;
class DateTagLib {
	def longDate = {attrs, body ->
		//parse the incoming date
		//def b = attrs.body ?: body()
def b = attrs["value"]
		//if no format attribute is supplied, use this
		def pattern = attrs["format"] ?: "EEEE, MMM d, yyyy"
		out << new SimpleDateFormat(pattern).format(b)
	}
}
