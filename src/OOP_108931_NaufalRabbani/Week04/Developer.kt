package OOP_108931_NaufalRabbani.Week04

import org.intellij.lang.annotations.Language

open class Developer(name: String, baseSalary: Int, val progammingLanguage: String) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $progammingLanguage")
    }

    override fun calculateSalary(): Int {
        return super.calculateSalary() + 300000
    }
}