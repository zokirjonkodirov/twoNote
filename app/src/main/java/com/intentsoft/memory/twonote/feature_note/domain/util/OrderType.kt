package com.intentsoft.memory.twonote.feature_note.domain.util

/**
 * @author user
 * @date 23.09.2021
 */
sealed class OrderType {

    object Ascending: OrderType()
    object Descending: OrderType()
}