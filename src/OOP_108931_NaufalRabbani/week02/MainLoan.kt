package OOP_108931_NaufalRabbani.week02

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    println("=== Sistem Peminjaman Buku Perpustakaan ===")

    print("Masukkan judul buku: ")
    val bookTitle = scanner.nextLine()
    print("Masukkan nama peminjam: ")
    val borrower = scanner.nextLine()
    print("Masukkan durasi pinjaman (dalam hari): ")
    var loanDuration = scanner.nextInt()

    if(loanDuration < 0){
        loanDuration = 1
    }

    val l1 = Loan(bookTitle, borrower, loanDuration)

    val denda = l1.calculateFine()

    println("selamat $borrower, Anda meminjam buku $bookTitle selama $loanDuration hari dengan denda sebesar Rp$denda")

}