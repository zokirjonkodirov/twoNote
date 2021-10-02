package com.intentsoft.memory.twonote.feature_note.presentation.notes

import com.intentsoft.memory.twonote.feature_note.domain.model.Note
import com.intentsoft.memory.twonote.ui.NoteOrder

/**
 * @author user
 * @date 23.09.2021
 */
sealed class NotesEvent {

    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}