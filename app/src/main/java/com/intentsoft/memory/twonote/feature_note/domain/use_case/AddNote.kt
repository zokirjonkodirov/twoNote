package com.intentsoft.memory.twonote.feature_note.domain.use_case

import com.intentsoft.memory.twonote.feature_note.domain.model.InvalidNoteException
import com.intentsoft.memory.twonote.feature_note.domain.model.Note
import com.intentsoft.memory.twonote.feature_note.domain.repository.NoteRepository

/**
 * @author user
 * @date 23.09.2021
 */
class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("Title of the cannot be empty.")
        }

        if(note.content.isBlank()) {
            throw InvalidNoteException("The content of the note cannot be empty.")
        }
        repository.insertNote(note)
    }
}