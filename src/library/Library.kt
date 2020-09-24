package library

import java.time.LocalDate

class Library(
    private val name: String,
    private val createdAt: LocalDate,
    private val books: MutableList<Book>

) {
    fun cadastrarLivro(book: Book) {
        this.books.add(book)
    }

    fun cadastrarColection(collectionBooks: MutableList<Book>) {
        this.books.addAll(collectionBooks)
    }

    fun consultBookByCode(code: Int): List<Book> {
        return this.books.filter {
            it.code == code
        }
    }

    fun rent(book: Book) {
        this.books[book.code].status = "ALUGADO"

    }

    fun sale(book: Book) {
        this.books[book.code].status = "VENDIDO"
    }
    
}