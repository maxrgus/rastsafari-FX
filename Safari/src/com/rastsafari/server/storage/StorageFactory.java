package com.rastsafari.server.storage;

import com.rastsafari.MainApp;

public class StorageFactory {
	public static Storage getStorageDB() {
		return new StorageDB();
	}

}
