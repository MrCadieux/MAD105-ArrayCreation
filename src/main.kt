fun main() {
    var soccerSupplies = arrayOf<String>("soccer balls", "cones", "pennies", "whistle", "shoes" )

//    for(supplies in soccerSupplies) {
//       println("$supplies")
//    }

    for (i in 0 .. soccerSupplies.size-1){
        print("${soccerSupplies[i]}")
        if (i==soccerSupplies.size-1)
            print(" ")
        else print(", ")

    }

}