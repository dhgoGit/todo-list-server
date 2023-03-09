package com.example.todolistspring.util

import org.slf4j.Logger
import org.slf4j.LoggerFactory

class Util{}
object LoggingUtil {
    val logger = run{ LoggerFactory.getLogger(Util::class.java) }
}

inline fun <reified T> T.logger(): Logger {
    return LoggingUtil.logger
}

inline fun <reified T> T.logInfo(msg: String) {
    logger().info(msg)
}

inline fun <reified T> T.logWarning(msg: String) {
    logger().warn(msg)
}

inline fun <reified T> T.logError(msg: String) {
    logger().error(msg)
}