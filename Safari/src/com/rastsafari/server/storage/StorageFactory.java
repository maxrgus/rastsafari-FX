package com.rastsafari.server.storage;

public class StorageFactory {

	public static Storage getStorageDB() {
		return new StorageDB();
	}

}
