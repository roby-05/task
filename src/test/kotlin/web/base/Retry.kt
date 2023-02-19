package web.base

import web.base.CommonBase.Companion.DEFAULT_TIMEOUT_IN_SEC
import java.time.LocalDateTime


const val DEFAULT_TIMEOUT_MS = (DEFAULT_TIMEOUT_IN_SEC * 1000)
const val DEFAULT_INTERVAL_MS = 100.toLong()

/**
 * This function accepts a block of code plus values for timout and interval.
 * It with execute the block up to the specified time, eating errors/base.exceptions.
 * If the block is successful, it will exit.  If the block is unsuccessful after
 * the specified timeout, a final execution will be done and error out as normal.
 *
 * @param timoutMs How long before the function times out
 * @param intervalMs How long to wait in between attempts when errors/base.exceptions are thrown; default 100
 * @param block Code to be retried
 */
fun retry(timoutMs: Long = DEFAULT_TIMEOUT_MS, intervalMs: Long = DEFAULT_INTERVAL_MS, block: () -> Any) {
    // Set datetime when function will timout
    val timeoutSeconds = timoutMs / 1000
    val endTime = LocalDateTime.now().plusSeconds(timeoutSeconds)
    // Execute block while current datetime is less than timout datetime eating errors/base.exceptions
    while (LocalDateTime.now() <= endTime) {
        try {
            block()
            return
        } catch (t: Throwable) {
            Thread.sleep(intervalMs)
        }
    }
    // Final block execution after timout datetime has been reached
    block()
}
