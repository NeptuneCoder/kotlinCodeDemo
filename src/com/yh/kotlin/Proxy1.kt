package com.yh.kotlin

/**
 * Created by yh on 9/1/17.
 */
var name : String
    get(){ return "my name is = $name "}
    set(value) {

    }

class Test(var str: String){
    var name: String?  = null
    fun test(){
        name.toString()
    }

}
open class Person

fun Person.test(data: MutableList<String>){

}

class Person3 : Person(){


}

  class Person1  private constructor(val xx: String){
    init {
        val xa = xx
    }
      var data: MutableList<String>? = null
    fun test(){

    }
      fun isEmpty(data: MutableList<String>): Boolean {
          return data?.isEmpty()

      }

}

private class Person2   constructor(val xx: String){
    init {
        val xa = xx
    }
    fun test(){
    }
}
open class Base(var x: Int,var b: Int){
    open fun add() : Int{
        return x + b
    }

}
class Person4(x: Int, b: Int) : Base(x,b){
    override fun add(): Int {
        return super.add()
    }

}



abstract class Derived  {
    abstract fun f()

    fun f2(){

    }
}

class MyClass {
    companion object {}
}
fun MyClass.Companion.foo(){

}

fun main(args: Array<String>) {
//    MyClass.foo()
//    val p = Person6()
//    p.wight
//    p.eat("xxxxx")
//    print("${p.wight}")
//    Person7.test2()
    print("result = ${Outer().Inner().foo()}")

    val v = Person6()
    fun test(xx: String) = v.eat(xx)
    test{
        println("xx = $it")
    }

}
private val tex = {xx: String,bb: String->Unit


}

class Person6
fun Person6.eat(name: String){

}

var  Person6.wight: Int
    get() = wight
    set(value)  {
        wight = 44
    }

class Person7{
    companion object{
        var name = ""
         fun test(){

        }
    }
}


fun Person7.Companion.test2(){

}

class Outer {
    private val bar: Int = 1
    inner class Inner {
        fun foo(): Int{ return bar}
    }
}


class Person9(){
    var name: String  = ""
    var age: Int = 23
}

fun test(code: (xx: String)->Unit){
    code.invoke("xxx")
}







