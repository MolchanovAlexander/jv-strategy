package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public static final String NEY_YEAR = "New Year";
    public static final String BLACK_FRIDAY = "Black Friday";
    public static final String BIRTHDAY = "Birthday";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case NEY_YEAR -> {
                return new NewYearDiscountService();
            }
            case BLACK_FRIDAY -> {
                return new BlackFridayDiscountService();
            }
            case BIRTHDAY -> {
                return new BirthdayDiscountService();
            }
            default -> {
                return new DefaultDiscountService();
            }
        }
    }
}
