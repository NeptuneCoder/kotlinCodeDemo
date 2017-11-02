package com.xxx.xxx.xxx


class Person{

}
/**
 * Created by yh on 9/20/17.
 */
val a : Double = 23.0
fun main(args: Array<String>){
    var datas = mutableListOf(Source(id = 1,name = "a"),Source(id = 2,name = "b"),Source(id = 3,name = "c"),Source(id = 4,name = "d"),Source(id = 5,name = "e"),Source(id = 6,name = "f"))

    datas.remove(datas[2])
    var index = 1
    for (item in datas){
        item.id = index
        index++

    }

    println("mutableList[3] = ${datas}")

}
data  class Source(var id: Int,var name: String)
fun test1(value : Int){
    print("value = $value")

}
fun test(){
    var  value = "我是能跑起来的"

    {
        value = "我测试能不能跑起来呢？"
        print("var1 = $value")
    }()
    print("var2 = $value")

}


private val closure= {
     var array: Array<Any>
    var strings: Array<Any> = arrayOf("1", "2")
    array = strings
}




/**
 * 计数统计
 */
fun justCount():() -> Unit{
    var count = 0
    return {
        println(count++)
    }
}
