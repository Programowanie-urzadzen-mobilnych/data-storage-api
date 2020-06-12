package pl.grupa33inf.ssi.data_store.api;

import java.lang.reflect.Constructor;

/**
 * Główny punkt dostępu do obiektów zarządzających bazą danych
 */
public class DataStoreApi {

    private static ILogDataStore logDataStore;
    private static INodeDataStore nodeDataStore;

    /**
     * Daje dostęp do singletona pozwlającego na zapis logów do bazy
     */
    public static ILogDataStore getLogDataStore() {
        if (logDataStore != null) {
            return logDataStore;
        }

        try {
            Class<?> logDataStoreClass = Class.forName("pl.grupa33inf.ssi.data_store.ILogDataStoreImpl");
            Constructor constructor = logDataStoreClass.getDeclaredConstructor();
            logDataStore = (ILogDataStore) constructor.newInstance();
            System.out.println(String.format("API: logDataStore == null?%s", logDataStore) == null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return logDataStore;
    }

    /**
     * Daje dostęp do singletonu pozwalającego na odczyt i zapis zmiennych do bazy
     */
    public static INodeDataStore getNodeDataStore() {
        if (nodeDataStore != null) {
            return nodeDataStore;
        }

        try {
            Class<?> logDataStoreClass = Class.forName("pl.grupa33inf.ssi.data_store.INodeDataStoreImpl");
            Constructor constructor = logDataStoreClass.getConstructor();
            nodeDataStore = (INodeDataStore) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nodeDataStore;
    }
}
