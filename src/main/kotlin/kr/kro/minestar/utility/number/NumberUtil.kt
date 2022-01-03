package kr.kro.minestar.utility.number

import java.text.DecimalFormat
import kotlin.math.pow
import kotlin.random.Random

/**
 * Int 에 3자리 수 마다 반점을 추가한 후 String 으로 출력합니다.
 */
fun Int.addComma(): String {
    return DecimalFormat("###,###").format(this)
}

/**
 * Long 에 3자리 수 마다 반점을 추가한 후 String 으로 출력합니다.
 */
fun Long.addComma(): String {
    return DecimalFormat("###,###").format(this)
}

/**
 * Double 을 백분율로 계산하여 확률에 맞게 Boolean 값을 출력합니다.
 */
fun Double.percent(): Boolean {
    if (this <= 0) return false
    if (this >= 1) return true
    val split = toString().split('.').last()
    val length = split.length.toDouble()
    val tureInt = split.toInt()
    val maxInt = 10.0.pow(length).toInt()
    val randomInt = Random.nextInt(maxInt)
    if (randomInt < tureInt) return true
    return false
}