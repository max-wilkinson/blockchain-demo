package kCoin

import java.time.Instant

data class Block(val previousHash: String,
                 val data: String,
                 val timestamp: Long = Instant.now().toEpochMilli(),
                 var hash: String = "") {
    init {
        hash = calculateHash()
    }

    fun calculateHash(): String {
        return "$previousHash$data$timestamp".hash()
    }
}