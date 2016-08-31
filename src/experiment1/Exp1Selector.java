package experiment1;

import com.sun.istack.internal.NotNull;
import ga.operations.Selector;

import java.util.List;

/**
 * Created by david on 31/08/16.
 */
public class Exp1Selector implements Selector{

    public Exp1Selector() {
    }

    @Override
    public int select(@NotNull List<Double> fitnessValues) {
        double r = Math.random();
        double currentValue = 0;
        for (int i = 0; i < fitnessValues.size(); i++) {
            currentValue = fitnessValues.get(i);
            if (r < currentValue)
                return i;
            r -= currentValue;
        }
        return fitnessValues.size()-1;
    }
}