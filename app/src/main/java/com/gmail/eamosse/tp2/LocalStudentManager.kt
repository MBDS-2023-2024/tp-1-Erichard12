package com.gmail.eamosse.tp2


class LocalStudentManager : StudentManager {


    private var etudiants = mutableListOf(
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
      return etudiants
    }

    override fun sortAgeAscDesc(type: String): List<Etudiant> {
        return when (type) {
            "ASC" -> etudiants.sortedBy{ it.age }
            "DESC" -> etudiants.sortedByDescending{ it.age }
            else -> etudiants
        }
    }

    override fun groupBySex(): Map<String, List<Etudiant>> {
        return etudiants.groupBy{ it.sexe }
    }

    override fun boysOrGirls(sexe: String): List<Etudiant> {
        return etudiants.filter{ it.sexe == sexe }
    }

    override fun onlyNames(): List<String> {
        return etudiants.map{ it.name}
    }

    override fun deleteBySex(sex: String) {
        etudiants.removeAll{ it.sexe == sex }
    }

    override fun reverse(): List<Etudiant> {
        return etudiants.reversed()
    }

    override fun clear() {
         etudiants.clear()
    }
}


