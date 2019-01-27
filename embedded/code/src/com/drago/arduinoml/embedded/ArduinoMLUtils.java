package com.drago.arduinoml.embedded;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class ArduinoMLUtils {

	public final static String INPUT_DIRECTORY_PATH = "./scripts/groovy";
	public final static String INPUT_EXTENSION = ".groovy";
	public final static String OUTPUT_DIRECTORY_PATH = "./generated";
	public final static String OUTPUT_ARDUINO_EXTENSION = ".ino";

	private ArduinoMLUtils() {
	}

	/**
	 * Get all scripts
	 * 
	 * @return
	 */
	public static File[] getAllScripts() {
		return getAllScripts(INPUT_DIRECTORY_PATH, INPUT_EXTENSION);
	}

	public static File[] getAllScripts(String inputDirectoryPath, String fileExtension) {
		File directory = new File(inputDirectoryPath);

		if (!directory.exists())
			return null;

		if (fileExtension == null) {
			return directory.listFiles();
		} else {
			return directory.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(fileExtension);
				}
			});
		}
	}

	public static void export(String fileName, String content) {
		String dirPath = OUTPUT_DIRECTORY_PATH;
		export(dirPath, fileName, content);
	}

	public static void export(String dirPath, String fileName, String content) {
		checkDirectory(dirPath);
		String filePath = dirPath + "/" + fileName + OUTPUT_ARDUINO_EXTENSION;
		write(filePath, content);
	}

	public static boolean checkDirectory(String directoryPath) {
		File file = new File(directoryPath);
		boolean directoryExists = file.exists();

		if (!directoryExists) {
			file.mkdirs();
		}

		return directoryExists;
	}

	public static void write(String filePath, String content) {
		try {
			File file = new File(filePath);
			
			if(file.exists())
				Files.delete(Paths.get(filePath));
			
			PrintWriter pw = new PrintWriter(new FileWriter(file));
			pw.print(content);
			pw.close();
		} catch (IOException e) {
			errorln("Could not write to \"" + filePath + "\" file.");
		}
	}

	public static void info(String ms) {
		System.out.print("[INFO | " + ms + " ]");
	}

	public static void infoln(String ms) {
		System.out.println("[INFO | " + ms + " ]");
	}

	public static void debug(String ms) {
		System.out.print("[DEBUG | " + ms + " ]");
	}

	public static void debugln(String ms) {
		System.out.println("[DEBUG | " + ms + " ]");
	}

	public static void error(String ms) {
		System.out.print("[ERROR | " + ms + " ]");
	}

	public static void errorln(String ms) {
		System.out.println("[ERROR | " + ms + " ]");
	}
}
