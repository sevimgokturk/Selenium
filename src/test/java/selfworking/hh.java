package selfworking;

import org.junit.Test;

import static org.junit.Assert.*;

public class hh {
    private int i =10;


    @Test
    public void thisKey(){

        System.out.println(i);
        i=20;
        System.out.println(i);

    }
    public void setI(int i){
        this.i =i;
    }

}
