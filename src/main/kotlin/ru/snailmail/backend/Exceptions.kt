package ru.snailmail.backend

import kotlin.Exception

class AlreadyExistsException(message: String? = null) : Exception(message)
class DoesNotExistException(message: String? = null) : Exception(message)
class AlreadyInTheChatException(message: String? = null) : Exception(message)
class DatabaseInternalException(message: String? = null) : Exception(message)