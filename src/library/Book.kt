package library

import java.math.BigDecimal

class Book(
    val code: Int,
    val title: String,
    val author: String,
    val yearStart: Int,
    val sendPrice: BigDecimal,
    val rentPrice: BigDecimal,
    var status: String
)