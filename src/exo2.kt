import kotlin.random.Random

fun lancerDes(nombreDes: Int, nombreFaces: Int): Int {
    var total = 0
    for (i in 1..nombreDes) {
        total += Random.nextInt(1, nombreFaces + 1)
    }
    return total
}
fun main() {
    println(lancerDes(1, 6))  // Un nombre entre 1 et 6
    println(lancerDes(2, 5))  // Un nombre entre 2 et 10
    println(lancerDes(4, 20))  // Un nombre entre 4 et 80
}
