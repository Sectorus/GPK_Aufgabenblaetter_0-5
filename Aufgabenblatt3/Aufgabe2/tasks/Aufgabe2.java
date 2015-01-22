import java.util.HashMap;
import java.util.Map;


public class Aufgabe2 {

    //Neue Map für Data-Objekte
    Map data = new HashMap();
    int index = 0;

    //Erzeugt neues Data-Objekt mit übergebenen Parametern.
    public void addData(String name, int value)
    {
        Data d = new Data(name,value);
        data.put(index, d);
        index++;
    }

    public Data getData(String name)
    {
        for(int i = 0; i < data.size(); i++)
        {
            //Überprüft ob abgefragter Name im Data-Objekt:Namen enthalten ist.
            if(data.get(i).toString().contains(name))
            {
                //Gibt Data-Objekt zurück
                return (Data) data.get(i);
            }
        }

        //Wenn nichts gefunden wird, wird NULL zurückgegeben.
        return null;
    }

    public static void main(String[] args) {
    }
}

//Arrays sind auf einen Datentypen beschränkt und ihre Größe wird bei der initialisierung definiert.
//Aus Klassen gehen Objekte hervor, welche mehrere Attribute von verschiedenen Datentypen besitzen können.
//Außerdem handelt es sich bei Klassen nicht um ein Feld, weswegen ohne Zusatzbewerkstelligungen nur ein Objekt per
//Initialisierung erzeugt werden kann.

//Arrays: siehe oben
//Maps: dynamische Größe, nicht auf einen Datentypen beschränkt