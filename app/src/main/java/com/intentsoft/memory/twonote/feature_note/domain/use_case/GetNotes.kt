package com.intentsoft.memory.twonote.feature_note.domain.use_case

import com.intentsoft.memory.twonote.feature_note.domain.model.Note
import com.intentsoft.memory.twonote.feature_note.domain.repository.NoteRepository
import com.intentsoft.memory.twonote.feature_note.domain.util.OrderType
import com.intentsoft.memory.twonote.ui.NoteOrder
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/**
 * @author user
 * @date 23.09.2021
 */
class GetNotes(
    private val repository: NoteRepository
) {

    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)
    ): Flow<List<Note>> {
        return repository.getNotes().map { notes ->
            when(noteOrder.orderType) {
                is OrderType.Ascending -> {
                    when(noteOrder) {
                        is NoteOrder.Title -> {
                            notes.sortedBy {
                                it.title.lowercase()
                            }
                        }
                        is NoteOrder.Date -> {
                            notes.sortedBy {
                                it.timeStamp
                            }
                        }
                        is NoteOrder.Color -> {
                            notes.sortedBy {
                                it.color
                            }
                        }
                    }
                }
                is OrderType.Descending -> {
                    when(noteOrder) {
                        is NoteOrder.Title -> {
                            notes.sortedByDescending {
                                it.title.lowercase()
                            }
                        }
                        is NoteOrder.Date -> {
                            notes.sortedByDescending {
                                it.timeStamp
                            }
                        }
                        is NoteOrder.Color -> {
                            notes.sortedByDescending {
                                it.color
                            }
                        }
                    }
                }
            }
        }
    }
}