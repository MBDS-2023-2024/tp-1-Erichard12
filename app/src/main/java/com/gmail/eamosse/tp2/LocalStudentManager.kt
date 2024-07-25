package com.gmail.eamosse.tp2


class LocalStudentManager : StudentManager {
// TODO 1. Implement all methods so that the class is conformed to the interface
    // TODO 2: init the class with a list of 10 students every time a new instance is created;
    // Use the following

    private var Etud = mutableListOf(
    Etudiant(name = "John1", code = "A1", sexe = "M", address = "Lilles", age = 20),
    Etudiant(name = "John2", code = "A2", sexe = "F", address = "Lilles", age = 30),
    Etudiant(name = "John3", code = "A3", sexe = "F", address = "Lilles", age = 41),
    Etudiant(name = "John4", code = "A4", sexe = "M", address = "Lilles", age = 42),
    Etudiant(name = "John5", code = "A5", sexe = "M", address = "Lilles", age = 34),
    Etudiant(name = "John6", code = "A6", sexe = "F", address = "Lilles", age = 12),
    Etudiant(name = "John7", code = "A7", sexe = "M", address = "Lilles", age = 28),
    Etudiant(name = "John8", code = "A8", sexe = "M", address = "Lilles", age = 16),
    Etudiant(name = "John9", code = "A9", sexe = "F", address = "Lilles", age = 10),
    Etudiant(name = "John10", code = "A10", sexe = "F", address = "Lilles", age = 56),
    )



    override fun listOf10(): List<Etudiant> {
      return Etud
    }

    override fun sortAgeAscDesc(type: String): List<Etudiant> {
        return when (type) {
            "ASC" -> Etud.sortedBy{ it.age }
            "DESC" -> Etud.sortedByDescending{ it.age }
            else -> Etud
        }
    }

    override fun groupBySex(): Map<String, List<Etudiant>> {
        return Etud.groupBy{ it.sexe }
    }

    override fun boysOrGirls(sexe: String): List<Etudiant> {
        return Etud.filter{ it.sexe == "F" }
    }

    override fun onlyNames(): List<String> {
        return Etud.map{ it.name}
    }

    override fun deleteBySex(sex: String) {
        Etud.removeAll{ it.sexe == sex }
    }

    override fun reverse(): List<Etudiant> {
        return Etud.reversed()
    }

    override fun clear() {
         Etud.clear()
    }
}


