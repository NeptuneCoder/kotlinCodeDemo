

fun EmailSpec.test(xx: String){

}

object Person{
    val value0 = "xxx"

}



fun main(args: Array<String>) {
//    Person("yiba",3)


    val obj = EmailSpec()
    obj.baseInfo()
    obj.from("from")
    obj.test("xxxx")
    var name = null
    name?.toString()
    name!!.toString()
    email{
        address = "1454025171@qq.com"

        baseInfo()
        from("this is  from")
        to("this is to fun")
        body{
            p("this is body fun")
        }

    }
}




class EmailSpec{
    companion object {

        /**
         * Id to identity READ_CONTACTS permission request.
         */
        private val REQUEST_READ_CONTACTS = 0

        /**
         * A dummy authentication store containing known user names and passwords.
         * TODO: remove after connecting to a real authentication system.
         */
        private val DUMMY_CREDENTIALS = arrayOf("foo@example.com:hello", "bar@example.com:world")
        fun  test(){

        }
    }

    var address: String  = ""

    fun baseInfo() = println("address = $address")
    fun from(from: String) = println("From: $from")
    fun to(to: String) = println("To: $to")
    fun subject(subject: String) = println("Subject: $subject")
    fun body(init: BodySpec.() -> Unit): BodySpec { //这个方法的参数为一个函数，该参数函数返回Unit。该方法返回BodySpec
        val body = BodySpec()
        body.init()
        return body
    }
}


class BodySpec {
    fun p(p: String) = println("P: $p")
}

/**
 * 1. 定义一个方法函数作为参数的方法
 * 2. 对EmailSpec 扩展了一个方法，该方法没有参数，没有返回值；目的是可以调用内部的其他方法
 * 3. 该方法返回一个EmailSpec 的对象
 *
 */

fun email(init: EmailSpec.()->Unit) {
    val email = EmailSpec() //创建一个对象
    email.init()
    //调用的是参数中定义的init函数，不是系统的init函数
}

