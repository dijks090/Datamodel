package meta;

import regeling.Regeling;

import java.util.EnumSet;
import java.util.List;

public class Meta<T extends Metable> {

    /**
     * Dit zijn de versies
     */
    private List<T> items;

    public enum State {
        IN_CONCEPT,
        DEFINITIEF,
        VERVALLEN,
        DELETED
    }

    private final static EnumSet activeStates = EnumSet.of(State.IN_CONCEPT, State.DEFINITIEF);

    public Meta(List<T> items) {
        this.items = items;
    }

    public void setNaarState(T item, State newState) {

        State huidig = item.getState();

        if (huidig == State.DEFINITIEF && newState == State.IN_CONCEPT) {
            throw new RuntimeException("mag niet");
        }
        this.items.stream()
                .filter(potential -> potential.getBegindatum().compareTo(item.getBegindatum()) == 0)
                .filter(reg -> reg.getState() == State.DEFINITIEF)
                .findAny()
                .ifPresent(regeling -> regeling.setState(State.VERVALLEN));
        item.setState(newState);
    }

    public boolean hasActiveState() {
        return this.items.stream().anyMatch(item -> activeStates.contains(item.getState()));
    }

    public T createInConceptVersie() {
//        items is er al 1 in concept -> fout
        return (T) new Regeling();
    }
}

