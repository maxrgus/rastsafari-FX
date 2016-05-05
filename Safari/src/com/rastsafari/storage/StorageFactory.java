package com.rastsafari.storage;

public class StorageFactory {

	public static Storage getStorageDB() {
		return new StorageDB();
	}

}
