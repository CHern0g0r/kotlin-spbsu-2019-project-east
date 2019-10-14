package ru.snailmail.backend

data class Message(val id : UID, val from: UID, var text: String) {
    var deleted = false
        private set
    private var edited = false
    private val attachments = mutableListOf<Attachment>()

    fun addAttachment(attachment: Attachment) {
        attachments.add(attachment)
    }

    fun edit(newText: String) {
        text = newText
        edited = true
    }

    fun delete() {
        deleted = true
    }

}