package rocks.zipcode.io.objectorientation;

import java.util.Arrays;
import java.util.function.Predicate;

public enum TVChannel {
    MSN,
    CNN,
    FOX,
    AE,
    MTV,
    BET,
    HBO,
    NBC,
    CBS;

    /**
     * @param ordinal; ordinal of the expected enumeration
     * @return enumeration with respective ordinal
     */
    public static TVChannel getByOrdinal(Integer ordinal) {
         switch(ordinal){
             case 0 : return MSN;

             case 1 : return CNN;

             case 2 : return FOX;

             case 3 : return AE;

             case 4 : return MTV;

             case 5 : return BET;

             case 6 : return HBO;

             case 7 : return NBC;

             case 8 : return CBS;
         }
        return null;
    }

    /**
     * @param name; name of the expected enumeration
     * @return enumeration with respective name
     */
    public static TVChannel getByName(String name) {
        return find(channel -> name.equals(channel.name()));
    }

    /**
     * @param predicate - clause to evaluate
     * @return the first channel which is applicable to the `predicate`
     */
    private static TVChannel find(Predicate<TVChannel> predicate) {
        return Arrays
                .stream(TVChannel.values())
                .filter(predicate)
                .findFirst()
                .get();
    }
}
