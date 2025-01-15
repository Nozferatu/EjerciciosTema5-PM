package com.cmj.ejerciciostema5

import kotlin.math.sqrt

class Point(
    val x: Int,
    val y: Int
) {
    infix fun distancia(otro: Point): Double{
        val distanciaX = this.x - otro.x
        val distanciaY = this.y - otro.y
        return sqrt(((distanciaX * distanciaX) + (distanciaY * distanciaY)).toDouble())
    }
}