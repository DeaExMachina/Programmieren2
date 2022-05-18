package at.campus02.uebungen.uebung_1;

public class LabyrinthTile {

    private Direction entry, exit;

    public Direction getEntry() {
        return entry;
    }

    public void setEntry(Direction entry) {
        this.entry = entry;
    }

    public Direction getExit() {
        return exit;
    }

    public void setExit(Direction exit) {
        this.exit = exit;
    }

    public LabyrinthTile(Direction entry, Direction exit) {
        this.entry = entry;
        this.exit = exit;
    }
}
