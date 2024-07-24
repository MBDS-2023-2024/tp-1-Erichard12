package com.gmail.eamosse.tp2

interface StudentManager {
    /**
     * A list of students
     */
    fun listOf10(): List<Etudiant>

    /**
     * Sort list
     */
    fun sortAgeAscDesc(type: String): List<Etudiant>

    /**
     * Group students by sex
     */
    fun groupBySex(): Map<String, List<Etudiant>>

    /**
     * Filter student by sex
     */
    fun boysOrGirls(sexe: String): List<Etudiant>

    /**
     * Get list of student names
     */
    fun onlyNames(): List<String>

    /**
     * Delete student by sex
     */
    fun deleteBySex(sex: String)

    /**
     * Invert the list
     */
    fun reverse(): List<Etudiant>

    /**
     * Clear the list
     */
    fun clear()
}