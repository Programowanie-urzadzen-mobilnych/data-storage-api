package pl.grupa33inf.ssi.data_store.api;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/**
 * Interfejs do zapisu, odczytu i usuwania zmiennych
 */
public interface INodeDataStore {
    /**
     * Odczytuje jedną zmienną o konkretnej nazwie z konkretnego urządzenia
     *
     * @param deviceUUID   Id urządzenia, dla którego odczytywana jest zmienna
     * @param variableName Nazwa zmiennej, która jest odczytywana
     * @return Optional zawierający odczytaną zmienną jeśli taka zmienna istnieje.
     * W przeciwnym przypadku zwraca pusty Optional
     */
    Optional<NodeVariable> readVariable(UUID deviceUUID, String
            variableName) throws ExecutionException, InterruptedException;

    /**
     * Odczytuje wszystkie zmienne z danego urządzenia.
     *
     * @param deviceUUID Id urządzenia, dla którego odczytywane są zmienne
     * @return Mapa zawierająca wszystkie zmienne. Kluczem jest nazwa zmiennej
     */
    Map<String, NodeVariable> readAllVariables(UUID deviceUUID) throws ExecutionException, InterruptedException;

    /**
     * Nadpisuje daną zmienną konfiguracyjną na urządzeniu
     *
     * @param deviceUUID   UUID urządzenia na którym zostanie zapisana zmienna
     * @param variableName Nazwa zmiennej do zapisania
     * @param value        Wartość do zapisania
     */
    void writeVariable(UUID deviceUUID, String variableName, String value);

    /**
     * Usuwa zmienną z urządzenia i oznacza ją jako usuniętą w bazie danych
     *
     * @param deviceUUID   Urządzenie z którego zostanie usunięta zmienna
     * @param variableName Nazwa zmiennej do usunięcia
     */
    void deleteVariable(UUID deviceUUID, String variableName);

}

