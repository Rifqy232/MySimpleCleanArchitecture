package com.mry.mysimplecleanarchitecture.data

import com.mry.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}