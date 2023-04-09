package hoavd.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtils {

    private static final Logger LOGGER = LogManager.getLogger(LogUtils.class);
    //Info Level Logs
    public static void info(String message) {
        LOGGER.info(message);
    }
}
