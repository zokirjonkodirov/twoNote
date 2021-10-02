package com.intentsoft.memory.twonote.feature_note.presentation.notes

import com.intentsoft.memory.twonote.feature_note.domain.model.Note
import com.intentsoft.memory.twonote.feature_note.domain.util.OrderType
import com.intentsoft.memory.twonote.ui.NoteOrder

/**
 * @author user
 * @date 23.09.2021
 */
data class NotesState(
    val note: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
