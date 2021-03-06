package ru.shishmakov.config;

import org.aeonbits.owner.Config;

/**
 * @author Dmitriy Shishmakov on 12.03.17
 */
@Config.Sources({"file:config/hz.properties", "classpath:config/hz.properties"})
public interface HzConfig extends Config {

    @DefaultValue("true")
    boolean server();

    @DefaultValue("2")
    int clientMinClusterSize();

    @DefaultValue("30")
    long clientInitialWaitTimeoutSec();
}
