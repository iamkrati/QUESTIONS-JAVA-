package live;

import Music.Playable;
import Music.string.Veena;
import Music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena obj1=new Veena();
        obj1.play();
        Saxophone obj2=new Saxophone();
        obj2.play();
        Playable two[]=new Playable[2];
        two[0]=obj1;
        two[1]=obj2;
        for(var j:two)
        {
            j.play();
        }
    }
}
