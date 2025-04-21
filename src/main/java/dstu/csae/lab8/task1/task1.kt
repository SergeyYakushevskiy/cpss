package dstu.csae.lab8.task1

fun main(){
    val isKotlinFun: Boolean = true
    val isJavaOld: Boolean = false

    println("Kotlin is fun? $isKotlinFun")
    println("Java is old? $isJavaOld")

    val andResult = isKotlinFun && isJavaOld
    val orResult = isKotlinFun || isJavaOld
    val notResult = !isKotlinFun

    println("AND: $andResult")
    println("OR: $orResult")
    println("NOT: $notResult")
}