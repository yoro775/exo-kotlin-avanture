//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun calculTotalDefence(bonusDef:Int, bonusTypeArmure:Int, bonusQualite:Int):Int{
    var resultat = 0
    resultat=bonusDef+bonusQualite+bonusTypeArmure
    return resultat
}

fun main() {
println(calculTotalDefence(3,2,1))

}