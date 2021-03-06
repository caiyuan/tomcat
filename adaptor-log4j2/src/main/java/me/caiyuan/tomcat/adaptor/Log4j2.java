package me.caiyuan.tomcat.adaptor;

import com.google.auto.service.AutoService;
import org.apache.juli.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Ryan
 */
@AutoService(Log.class)
public class Log4j2 implements Log {

    private Logger logger;

    public Log4j2() {
    }

    public Log4j2(String name) {
        logger = LogManager.getLogger(name);
    }

    @Override
    public final boolean isErrorEnabled() {
        return logger.isErrorEnabled();
    }

    @Override
    public final boolean isWarnEnabled() {
        return logger.isWarnEnabled();
    }

    @Override
    public final boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    @Override
    public final boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    @Override
    public final boolean isFatalEnabled() {
        return logger.isFatalEnabled();
    }

    @Override
    public final boolean isTraceEnabled() {
        return logger.isFatalEnabled();
    }

    @Override
    public final void debug(Object message) {
        logger.debug(message, null);
    }

    @Override
    public final void debug(Object message, Throwable t) {
        logger.debug(message, t);
    }

    @Override
    public final void trace(Object message) {
        logger.trace(message, null);
    }

    @Override
    public final void trace(Object message, Throwable t) {
        logger.trace(message, t);
    }

    @Override
    public final void info(Object message) {
        logger.info(message, null);
    }

    @Override
    public final void info(Object message, Throwable t) {
        logger.info(message, t);
    }

    @Override
    public final void warn(Object message) {
        logger.warn(message, null);
    }

    @Override
    public final void warn(Object message, Throwable t) {
        logger.warn(message, t);
    }

    @Override
    public final void error(Object message) {
        logger.error(message, null);
    }

    @Override
    public final void error(Object message, Throwable t) {
        logger.error(message, t);
    }

    @Override
    public final void fatal(Object message) {
        logger.fatal(message, null);
    }

    @Override
    public final void fatal(Object message, Throwable t) {
        logger.fatal(message, t);
    }
}
