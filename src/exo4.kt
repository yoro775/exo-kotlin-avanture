fun attaque(
    nombrepointviecible: Int,
    defensetotaldecible: Int,
    degatarme:Int,
    nomattaquant:String,
    nomcible:String,
) {
    var degat= degatarme - defensetotaldecible
    if(degat<0)
    {
        degat=0
    }
    var nouveauPv= nombrepointviecible -degat
    if(nouveauPv>0){
        nouveauPv=0
    }
    var degatfinal= nombrepointviecible - nouveauPv
    println("$nomattaquant attaque  $nomcible  pour $degatfinal de degat")
}


fun main(){
    print(attaque(15,4,3,"toto","truc"))
}