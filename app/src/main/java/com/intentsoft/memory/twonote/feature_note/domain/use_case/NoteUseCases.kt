package com.intentsoft.memory.twonote.feature_note.domain.use_case

/**
 * @author user
 * @date 23.09.2021
 */
data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)