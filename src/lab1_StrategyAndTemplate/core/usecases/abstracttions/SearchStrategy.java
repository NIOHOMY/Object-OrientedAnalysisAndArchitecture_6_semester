package lab1_StrategyAndTemplate.core.usecases.abstracttions;


import lab1_StrategyAndTemplate.core.usecases.interfaces.Info;

public abstract class SearchStrategy implements Info {
    protected long elapsedTime = 0;
    public abstract int search(String text, String subString);
}
