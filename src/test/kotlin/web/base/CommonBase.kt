package web.base

import java.time.Duration
import java.util.logging.Logger

open class CommonBase {

    companion object {
        const val DEFAULT_TIMEOUT_IN_SEC = 30L
        val LOG: Logger = Logger.getLogger(CommonBase::class.java.name)
        val DEFAULT_TIMEOUT_DURATION: Duration = Duration.ofSeconds(DEFAULT_TIMEOUT_IN_SEC)
    }
}
