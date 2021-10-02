package com.intentsoft.memory.twonote.feature_note.presentation.util

/**
 * @author user
 * @date 23.09.2021
 */
sealed class Screen(
    val route: String
) {
    object NoteScreen: Screen("notes_screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}
