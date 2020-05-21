package pl.grupa33inf.ssi.data_store.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DataStoreApi {

    private static ILogDatastore logDatastore;
    private static INodeDataStore nodeDataStore;

    public static ILogDatastore getLogDataStore(){
        if(logDatastore != null){
            return logDatastore;
        }

        try {
            Class<?> logDataStoreClass =  Class.forName("pl.grupa33inf.ssi.data_store.ILogDataStoreImpl");
            Constructor constructor = logDataStoreClass.getDeclaredConstructor();
            logDatastore = (ILogDatastore) constructor.newInstance();
            System.out.println(String.format("API: logDataStore == null?%s", logDatastore) == null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }            System.out.println(String.format("API: logDataStore == null?%s", logDatastore) == null);

        return logDatastore;
    }
    public static INodeDataStore getNodeDataStore(){
        if(nodeDataStore != null){
            return nodeDataStore;
        }

        try {
            Class<?> logDataStoreClass =  Class.forName("pl.grupa33inf.ssi.data_store.INodeDataStoreImpl");
            Constructor constructor = logDataStoreClass.getConstructor();
            nodeDataStore = (INodeDataStore) constructor.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return nodeDataStore;
    }
}
