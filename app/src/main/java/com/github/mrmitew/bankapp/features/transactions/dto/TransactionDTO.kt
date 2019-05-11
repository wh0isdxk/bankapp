package com.github.mrmitew.bankapp.features.transactions.dto

import com.github.mrmitew.bankapp.features.transactions.vo.Transaction
import java.math.BigDecimal

data class TransactionDTO(
    val id: Int,
    val name: String,
    val description: String?,
    val comment: String?,
    val date: String,
    val mutationType: String,
    val amount: BigDecimal,
    val targetName: String,
    val targetAccount: String
)

fun TransactionDTO.toDomainModel() =
    Transaction(
        id,
        name,
        description,
        comment,
        date,
        mutationType,
        amount,
        targetName,
        targetAccount
    )

fun Transaction.toDTO() =
    TransactionDTO(
        id,
        name,
        description,
        comment,
        date,
        mutationType,
        amount,
        targetName,
        targetAccount
    )