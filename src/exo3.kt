import kotlin.random.Random

fun calculerDegats(
    nombreDes: Int,
    nombreFaces: Int,
    bonusQualite: Int,
    seuilCritique: Int,
    multiplicateurCritique: Int
): Int {
    // Lancer les dés
    var resultatDes = 0
    for (i in 1..nombreDes) {
        resultatDes += Random.nextInt(1, nombreFaces + 1)
    }

    // Vérifier si le score atteint ou dépasse le seuil de coup critique
    if (resultatDes >= seuilCritique) {
        resultatDes *= multiplicateurCritique
    }

    // Ajouter le bonus de qualité de l'arme
    var degatsTotaux = resultatDes + bonusQualite

    // S'assurer que le nombre final est au moins 0
    return if (degatsTotaux < 0) 0 else degatsTotaux
}
fun main() {
    println(calculerDegats(1, 6, 2, 6, 2))  // Résultat : entre 1 et 12
    println(calculerDegats(1, 8, 3, 5, 3))  // Résultat : entre 1 et 24
    println(calculerDegats(2, 4, 2, 10, 2))  // Résultat : entre 2 et 16


}