import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Leonid on 02.08.2016.
 */
public class Task1 {
    public static void main(String[] args){
        try {
            InputStream inputStream = new FileInputStream("");
            DataInputStream in = new DataInputStream(inputStream);
        }
        catch(Exception e){

        }
    }
}

class kek implements Observer{
    @Override
    public void update(Observable o, Object arg) {

    }
}