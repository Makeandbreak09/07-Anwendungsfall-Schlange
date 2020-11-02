package control;

import model.Queue;
import model.Tray;

/**
 * Created by Jean-Pierre on 27.10.2016.
 */
public class MainController {

    private Queue<Tray> trayQueue; //TODO: 02 - Sobald die Queue implementiert ist, wird der Controller um die Datenstruktur erweitert. D.h. aus einer Referenz auf ein einzelnes Objekt, wird eine Refernz auf ein Objekt der Klasse Queue zur Verwaltung von vielen Tray-Objekten.

    /**
     * Ich bin kein Konstrkutor. Ich steh' hier nur so rum!
     */
    public MainController(){
        //Hier muss später eine Initialisierung der Queue stattfinden.
        trayQueue = new Queue<>();
    }

    /**
     * Sobald die Datenstruktur Queue fertig ist, dient diese Methode der darstellerischen Ausgabe der Queue.
     * @return String-Array zu den Informationen, die in der Queue gespeichert sind.
     */
    public String[] showAllTrays(){
        //TODO: 06 - Bei einer Queue ist es unüblich, auf alle Daten innerhalb der Queue zuzugreifen. Gerade das ist hier aber nötig! Hier muss mit einem "Trick" gearbeitet werden, ohne die Klasse Queue zu überarbeiten.
        String[] output = new String[1];
        if(trayQueue != null){
            output[0] = trayQueue.getTimeAndInfo();
        }else{
            output[0] = "Nüx da! :O";
        }
        return output;
    }

    /**
     * Ein neues Tray-Objekt wird erstellt und der Queue hinzugefügt.
     * @return Informationen zum Objekt.
     */
    public String addNewTray(){
        //TODO: 03 - Hinzufügen von Objekten in die Schlange. Aktuell wird nur die einzelne Referenz neu gesetzt.
        trayQueue = new Tray();
        return trayQueue.getTimeAndInfo();
    }

    /**
     * Das vorderste Tray-Objekt wird aus der Schlange entfernt.
     * @return Informationen zum Objekt.
     */
    public String releaseTray(){
        //TODO: 05 - Das vorderste Tray-Objekt wird entfernt.
        if(trayQueue != null){
            String output = trayQueue.getTimeAndInfo();
            trayQueue = null;
            return output;
        }
        return "---";
    }

    /**
     * Es wird nur die Speicherinformation des ersten Tray-Objekts aus der Queue dargestellt. Das Objekt wird dabei nicht entfernt.
     * Die Queue bleibt also unberührt.
     * @return Informationen zum vordersten Objekt.
     */
    public String getInfoOfFirst(){
        //TODO: 04 - Ausgabe der Informationen zum vordersten Objekt.
        if(trayQueue != null) return trayQueue.toString();
        return "---";
    }
}
