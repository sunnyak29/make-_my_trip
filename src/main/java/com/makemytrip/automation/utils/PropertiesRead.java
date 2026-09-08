package com.makemytrip.automation.utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesRead {

	private static final String DEFAULT_CONFIG = "Config/Config.properties";
	private final Properties properties;

	public PropertiesRead() {
		properties = new Properties();
		loadFromClasspath();
		loadExternalOverrides();
	}

	private void loadFromClasspath() {
		try (InputStream input = PropertiesRead.class.getClassLoader().getResourceAsStream(DEFAULT_CONFIG)) {
			if (input == null) {
				throw new IllegalStateException("Default configuration was not found on the classpath: " + DEFAULT_CONFIG);
			}
			properties.load(input);
		} catch (IOException exception) {
			throw new IllegalStateException("Unable to load default configuration", exception);
		}
	}

	private void loadExternalOverrides() {
		Path externalConfig = Paths.get(System.getProperty("user.dir"), "config", "config.properties");
		if (!Files.isRegularFile(externalConfig)) {
			return;
		}

		try (InputStream input = Files.newInputStream(externalConfig)) {
			properties.load(input);
		} catch (IOException exception) {
			throw new IllegalStateException("Unable to load external configuration: " + externalConfig, exception);
		}
	}

	public String readProperty(String key) {
		String value = System.getProperty(key, properties.getProperty(key));
		if (value == null || value.isBlank()) {
			throw new IllegalArgumentException("Required configuration property is missing: " + key);
		}
		return value.trim();
	}
}


