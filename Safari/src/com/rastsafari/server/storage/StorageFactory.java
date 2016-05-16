package com.rastsafari.server.storage;

/**
 * Storage factory for Rastsafari
 * @author maxrg
 *
 */
public class StorageFactory {
	public static Storage getStorageDB() {
		return new StorageDB();
	}

}
