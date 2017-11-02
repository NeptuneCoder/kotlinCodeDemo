package com.yh.kotlin
fun test(str: String, age: Int){

}

val val0 = { str: String, age: Int ->
        print("str === == ${str}  age == $age \n")
        print("str === == ${str}  age == $age")
}

fun test3(funName: (String,Int)->Unit,str: String, age: Int){
    funName.invoke(str,age)
}


fun main(args: Array<String>) {
//    Person("yiba",3)
    var name: String? = null

    test3(val0,"makai",21)
}




