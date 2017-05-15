package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FlagFactory {

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        Map flag= new HashMap<Nationality,List<Color>>();
        flag.put(Nationality.DUTCH,Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        flag.put(Nationality.GERMAN,Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        flag.put(Nationality.BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        flag.put(Nationality.FRENCH,Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        flag.put(Nationality.ITALIAN,Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
        flag.put(Nationality.ROMANIA,Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
        flag.put(Nationality.IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
        flag.put(Nationality.HUNGARIAN,Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
        flag.put(Nationality.BULGARIAN,Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));
        flag.put(Nationality.RUSSIA, Arrays.asList(Color.WHITE, Color.BLUE, Color.RED);


        List<Color> result;
        if(flag.get(nationality)!=null){
            result= (List<Color>) flag.get(nationality);
        }else{
            result = Arrays.asList(Color.GRAY);

        }
        return result;
    }


    // end::getFlag[]

}